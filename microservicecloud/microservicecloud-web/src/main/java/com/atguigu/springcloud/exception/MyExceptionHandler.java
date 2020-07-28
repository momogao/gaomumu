package com.atguigu.springcloud.exception;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class MyExceptionHandler {
    public static final String BOOT_ERROR_VIEW = "error";

    @ExceptionHandler(value = UnauthorizedException.class)
    public Object unauthorizedHandler(HttpServletRequest reqest,
                                      HttpServletResponse response, Exception e){
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", reqest.getRequestURL());
        mav.setViewName(BOOT_ERROR_VIEW);
        return mav;
    }

    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest reqest,
                               HttpServletResponse response, Exception e) throws Exception {

        e.printStackTrace();

        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", reqest.getRequestURL());
        mav.setViewName(BOOT_ERROR_VIEW);
        return mav;
    }

}
