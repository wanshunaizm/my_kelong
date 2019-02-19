package com.itheima.exception;

import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 */
public class SysExceptionResolver implements HandlerExceptionResolver{
    /**
     * 处理异常业务逻辑
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
       //获取到异常对象
        System.out.println("resolveException");
        Exception exception =null;
        if (e instanceof MaxUploadSizeExceededException){
            Exception exception1 = new Exception("上传的文件超过限制");
        }else {
            new Exception("系统正在维护");
        }
        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        //存放到request域
        mv.addObject("errorMsg",exception.getMessage());
        mv.setViewName("/WEB-INF/pages/error.jsp");
        return mv;


    }
}
