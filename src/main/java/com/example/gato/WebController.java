
package com.example.gato;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins="*")
@Controller
public class WebController {
    
    @GetMapping("/")
    public String greeting() {
        System.out.println("Hola SpringBoot");
        return "random";
    }
    
    @RequestMapping(value= "/randomValue", method= RequestMethod.GET)
    @ResponseBody
    public int getRandomValue() {
        int random = (int) (Math.random() * (6 - 0));
        return random;
    }
}
