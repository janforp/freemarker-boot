package com.janita.freemarkerboot.controller.pub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Janita on 2017/6/15 0015-下午 5:22
 * 该类是：
 */
@Controller
public class IndexController {

    @RequestMapping({"/", "/index"})
    public String index() {
        return "index";
    }
}
