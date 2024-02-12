package org.davshaw.livechat.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    
    @GetMapping("/")
    public String root() {
        return "login";
    }

    @GetMapping("/index")
    public String index() {
        return "login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
}
