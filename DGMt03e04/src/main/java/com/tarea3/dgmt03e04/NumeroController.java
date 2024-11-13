package com.tarea3.dgmt03e04;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class NumeroController {
    Random random = new Random();
    public Set<Integer> lista = new LinkedHashSet<>();
    
    @GetMapping({"/","/list","","home"})
    public String showlist(Model model){
        model.addAttribute("cantidadTotal", lista.size());
        model.addAttribute("listaNumeros", lista);
        return "index";
    }

    @GetMapping("/new")
    public String showNew(){
        boolean añadido;
        do{
            añadido = lista.add(random.nextInt(100)+1);
        }while(!añadido);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String showDelete (@PathVariable Integer id) {
        lista.remove(id);
        return "redirect:/list";
    }
    
}
