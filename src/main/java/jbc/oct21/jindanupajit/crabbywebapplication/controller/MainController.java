package jbc.oct21.jindanupajit.crabbywebapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value={"/","/index","/index.html"})
    public String Index () {
        return "index";
    }
}
