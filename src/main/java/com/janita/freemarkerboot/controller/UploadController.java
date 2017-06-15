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

    @RequestMapping("/upload")
    public String upload(HttpServletRequest request, Map<String, String> map) {
        map.put("str","你好");
        request.setAttribute("a","b");
        return "upload";
    }
}
