package com.aven.quintuple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: test
 * Package: com.aven.quintuple.controller
 * Description:
 *
 * @Author: Aven
 * @Create: 2024.09.30  16:08
 */
@RestController
public class test {

    @GetMapping("/")
    public String HelloWolrd(){
        return "HelloWolrd";
    }
}
