package com.luanphm.dictionaryflashcard.controllers;

import com.luanphm.dictionaryflashcard.services.home.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping(value = "gohome")
    public String goHome(){
        return homeService.goHome();
    }

}
