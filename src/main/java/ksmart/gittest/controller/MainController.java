package ksmart.gittest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(Model model) {

        model.addAttribute("title", "git 테스트");
        return "main";
    }
}
