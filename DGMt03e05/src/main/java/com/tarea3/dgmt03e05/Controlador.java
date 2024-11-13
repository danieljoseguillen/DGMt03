package com.tarea3.dgmt03e05;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {
    //Creo que con un array bastaba...... 
    //Peeeeero a futuro este es mas manejable.
    ArrayList<Integer> votoList = new ArrayList<>();

    public Controlador(){
        for(int i=0;i<=3;i++){
            votoList.add(0);
        };
    }
    @GetMapping({"/", "index", "/home" })
    public String showIndex(Model model) {
        model.addAttribute("votos", votoList);
        return "index";
    }

    @GetMapping("/voto")
    public String votacion(@RequestParam (required = false, defaultValue = "-1") Integer foto) {
        if(foto >= 0 && foto <= votoList.size()-1){
            votoList.set(foto, votoList.get(foto)+1);
        };
        return "redirect:/home";
    }

}
