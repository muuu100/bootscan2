package com.muuu.controller;

import com.muuu.model.MyDto;
import com.muuu.model.MyDtoB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private MyDto myDto;

    @Autowired
    private MyDtoB myDtoB;

    @GetMapping("/getInfo")
    public String getInfo(){
        System.out.println(myDto);
        return "name:" + myDto.getName() + " age:" + myDto.getAge() + " sex:" + myDto.getSex();
    }

    @GetMapping("/getInfo2")
    public String getInfo2(){
        System.out.println(myDtoB);
        return "name:" + myDtoB.getName() + " en_name:" + myDtoB.getEnName();
    }
}
