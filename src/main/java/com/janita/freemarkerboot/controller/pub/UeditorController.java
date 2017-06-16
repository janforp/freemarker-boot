package com.janita.freemarkerboot.controller.pub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Janita on 2017/6/15 0015-下午 5:26
 * 该类是：
 */
@Controller
public class UeditorController {

    @RequestMapping("/editor")
    public String editor(HttpServletRequest request) {
        request.setAttribute("a","b");
        return "editor";
    }
}
