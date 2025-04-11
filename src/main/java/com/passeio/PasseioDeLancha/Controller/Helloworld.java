package com.passeio.PasseioDeLancha.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Helloworld {

@GetMapping("/teste")
public String teste (){
    return "index";
}
}
