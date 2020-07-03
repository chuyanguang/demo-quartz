package com.example.demo.controller;

import com.example.demo.entity.ResultData;
import com.example.demo.entity.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController(value = "hello")
public class HelloController {

    @GetMapping(value = "/say/{name}")
    public ResultData sayHello(@PathVariable(value = "name") String name) {
        log.info("hello {}", name);
        return new ResultData(200, "成功", name);
    }

}
