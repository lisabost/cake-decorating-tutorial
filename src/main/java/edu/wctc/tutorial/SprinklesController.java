package edu.wctc.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/finishing-touches")
public class SprinklesController {

    @RequestMapping("/sprinkles")
    public String getSprinklesFacts() { return "pages/step-three"; }
}
