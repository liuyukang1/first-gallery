package com.example.homework_one.service.serviceImpl;

import com.example.homework_one.dao.UserMapper;
import com.example.homework_one.dao.UserMapperExtra;
import com.example.homework_one.dto.UserDTO;
import com.example.homework_one.model.User;
import com.example.homework_one.service.UserService;
import global.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @author: lyk
 * @date: 9/14/2019
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserMapperExtra userMapperExtra;

    @Resource
    RedisTemplate redisTemplate;

    private static final String ALL_TOKEN = "ALL_USER_TOKENS";

    @Override
    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }

    @Override
    public UserDTO selectByPrimaryKey(String id) {
        return userMapperExtra.selectByPrimaryKey(id);
    }

    /**
     * token 登陆
     * @param token
     * @return
     */
    @Override
    public JSONResult<String> loginByCookie(String token) {
        JSONResult jsonResult = new JSONResult();

        boolean flag = false;

//        Token result = tokenService.selectByValue(token);

        List<String> tokens
                = redisTemplate.opsForList().range(ALL_TOKEN, 0, -1);

        if (tokens != null && tokens.size() > 0) {
            for (String str : tokens) {
                if (str.equals(token))
                    flag = true;
            }
        }

        // 判断 token 是否存在
        // 存在则将 token 返回给前台
        // 并且将 token 数据存入 redis
        if (flag) {
            // 将 token 存入 redis
            String newToken = dealTheToken("1");

            redisTemplate.opsForList().leftPush(ALL_TOKEN, newToken);

            setTheJSONResult(jsonResult, newToken);

        } else {
            jsonResult.setCode(400);
            jsonResult.setMessage("token 失效，请重新登陆");
        }
        return jsonResult;
    }



    /**
     * 用户名密码登陆
     * @param name
     * @param password
     * @return
     */
    @Override
    public JSONResult<String> loginByPassWord(String name, String password) {
        JSONResult jsonResult = new JSONResult();
        User user = userMapper.selectByName(name);

        // 判断登陆是否成功
        // 存在则将 token 返回给前台
        // 并且将 token 数据存入 redis
        if (user == null) {
            jsonResult.setCode(400);
            jsonResult.setMessage("该用户尚未注册");
        } else if (!user.getPassword().equals(password)) {
            jsonResult.setCode(400);
            jsonResult.setMessage("用户密码错误");
        } else {

            String newToken = dealTheToken(user.getId());

            // 将 token 存入 redis
            redisTemplate.opsForList().leftPush(ALL_TOKEN, newToken);

            // 如果成功则返回给前台
            setTheJSONResult(jsonResult, newToken);
        }

        return jsonResult;
    }

    /**
     * 生成不重复随机字符串
     * @return
     */
    @Override
    public String createRandomString() {
        String middle = UUID.randomUUID().toString();
        return "JAVAEE" + System.currentTimeMillis() + middle;
    }

    /**
     * 设置登陆成功返回参数
     * @param jsonResult
     * @param value
     * @param <T>
     */
    public<T> void setTheJSONResult(JSONResult<T> jsonResult, T value) {
        jsonResult.setCode(200);
        jsonResult.setMessage("登陆成功");
        jsonResult.setData(value);
    }

    /**
     * 生成一个新的 token
     * @param userId
     * @return
     */
    @Override
    public String dealTheToken(String userId) {
        return "VALUE" + createRandomString();
    }

    /**
     * 删除用户数据（包括选课信息）
     * @param name
     * @return
     */
    @Override
    public boolean deleteByName(String name) {
        return userMapperExtra.deleteByName(name);
    }

    @Override
    public boolean insert(User record) {
        record.setId(createRandomString());
        return userMapperExtra.insert(record);
    }
}
