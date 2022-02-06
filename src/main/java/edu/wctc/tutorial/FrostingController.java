package edu.wctc.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/frosting")
public class FrostingController {

    @RequestMapping("/spreading")
    public String getFrostingFacts() { return "pages/step-two"; }
}
