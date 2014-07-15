package com.prasans.gradleapp.controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Slf4j
public class InitController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String loadIndexPage(Model model) {
        model.addAttribute("title", "This is a Gradle Spring App !!");
        log.info("Inside Controller class.");
        return "greeting";
    }
}
