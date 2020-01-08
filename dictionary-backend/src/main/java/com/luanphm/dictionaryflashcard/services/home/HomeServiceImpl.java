package com.luanphm.dictionaryflashcard.services.home;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService{

    @Override
    public String goHome() {
        return "go to home";
    }
}
