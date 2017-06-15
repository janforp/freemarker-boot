package com.janita.freemarkerboot.controller;

import com.janita.freemarkerboot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

    /**
     * 传递参数的第二种方法,通过入参的map直接带到页面
     * 单个参数
     * @param param
     * @return
     */
    @GetMapping(value = "/two")
    public String parameter(Map<String, Object> param) {
        param.put("map", "我是通过map带到页面的参数");
        return "two";
    }
}