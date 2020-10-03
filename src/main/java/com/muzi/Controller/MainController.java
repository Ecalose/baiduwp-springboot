package com.muzi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class MainController {
@GetMapping(value = "/checkin")
    public String mainInterface(String surl,String pwd) throws IOException {
        return Functions.verifyPwd(surl,pwd);
    }
}