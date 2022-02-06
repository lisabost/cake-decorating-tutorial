package edu.wctc.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cake")
public class CakeController {

    @RequestMapping("/baking")
    public String getCakeMakingFacts() { return "pages/step-one"; }
}
