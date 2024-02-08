package org.davshaw.livechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {
    
    @GetMapping("/")
    public String index() {
        return "login";
    }

    @GetMapping("/root")
    public String root() {
        return "login";
    }

    @GetMapping("/main")
    public String main() {
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

}
