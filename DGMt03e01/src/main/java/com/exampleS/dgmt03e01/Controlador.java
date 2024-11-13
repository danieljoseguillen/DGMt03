package com.exampleS.dgmt03e01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
        @GetMapping({"/","/home", "/index"})
    public String home(Model model){
        return "indexView";
    }

    @GetMapping("/galeria")
    public String galery(Model model){
        return "galeria-fotosView";
    }

    @GetMapping("/premios")
    public String awards(Model model){
        return "palmaresView";
    }
    /*
    @GetMapping("/enlaces")
    public String links(Model model){
        return "enlaces-externosView";
    }
    */
}
