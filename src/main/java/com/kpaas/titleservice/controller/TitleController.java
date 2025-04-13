package com.kpaas.titleservice.controller;

import com.kpaas.titleservice.model.ResultData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleController {

    @Value("${config.data1}")
    private String data1;

    @Value("${config.data2}")
    private String data2;

    @GetMapping("/title-info")
    public ResultData getName() {
        ResultData res = new ResultData(data1, data2);
        System.out.println("call to /title-info");
        return res;
    }
}