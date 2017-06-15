package com.janita.freemarkerboot.controller;

import com.janita.freemarkerboot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Janita on 2017/6/15- 20:57
 * 该类是:验证freemaker参数方式
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    @GetMapping
    public String paramOne() {
        User user = User.getUser();


        return "param/param";
    }
}
