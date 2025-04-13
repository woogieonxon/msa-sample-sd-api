package com.kpaas.titleservice.controller;

import com.kpaas.titleservice.model.TitleEntity;
import com.kpaas.titleservice.service.TitleService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleController {

    private final TitleService titleService;

    public TitleController(TitleService titleService) { this.titleService = titleService; }

    @GetMapping("/title-info")
    public TitleEntity getName() {
        TitleEntity res = titleService.getTitleByNo(1L).orElse(null);
        System.out.println("call to /title-info");
        return res;
    }
}