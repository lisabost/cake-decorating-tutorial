package edu.wctc.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("/forward-me")
    public String doForward() {
        return "forward:/cake/baking";
    }

    @RequestMapping("/redirect-me")
    public String doRedirect() {
        return "redirect:http://www.wctc.edu"; }
}
