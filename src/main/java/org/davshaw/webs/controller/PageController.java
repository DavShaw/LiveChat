package org.davshaw.webs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/root")
    public String root() {
        return "index";
    }

    @GetMapping("/main")
    public String main() {
        return "index";
    }
    
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

}
