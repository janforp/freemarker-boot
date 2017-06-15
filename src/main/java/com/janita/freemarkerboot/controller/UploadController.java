package com.janita.freemarkerboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Janita on 2017/6/15 0015-下午 6:01
 * 该类是：
 */
@Controller
public class UploadController {

    @RequestMapping("/upload")
    public String upload() {
        return "upload";
    }
}
