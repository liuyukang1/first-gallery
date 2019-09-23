package com.example.homework_one.filter;

import com.example.homework_one.model.User;
import com.example.homework_one.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author: lyk
 * @date: 9/17/2019
 */
//@WebFilter(filterName = "ayUserFilter", urlPatterns = "/")
public class AyUserFilter  {

//    @Autowired
//    private UserService userService;
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println(userService);
//        System.out.println("init >>>>>>");
//    }
//
//    @Override
//    public void doFilter(ServletRequest request,
//                         ServletResponse response, FilterChain chain)
//            throws IOException, ServletException {
//        System.out.println("doFilter >>>>>>");
//        chain.doFilter(request, response);
//    }
//
//    @Override
//    public void destroy() {
//
//    }
}
