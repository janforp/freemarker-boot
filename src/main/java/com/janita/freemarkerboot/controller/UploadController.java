package com.janita.freemarkerboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Janita on 2017/6/15 0015-下午 6:01
 * 该类是：
 */
@Controller
public class UploadController {

    /**
     * freemaker传递参数方法1:类似jsp,直接使用 request
     * @param request
     * @return
     */
    @RequestMapping("/upload")
    public String upload(HttpServletRequest request) {
        request.setAttribute("request","我是通过request传递到页面的参数");
        return "upload";
    }
}