package com.exampleS.dgmt03e02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {
    List<List<String>> premios1 = new ArrayList<List<String>>();
    List<List<String>> premios2 = new ArrayList<List<String>>();
    List<List<String>> premios3 = new ArrayList<List<String>>();
    List<List<String>> premios4 = new ArrayList<List<String>>();
    public Controlador(){
        premios1.add(Arrays.asList("2011","Sabaton","Best Breakthrough Band","Obtenido"));
        premios1.add(Arrays.asList("2012","Sabaton","Best Live Band (GER)","Obtenido"));
        premios1.add(Arrays.asList("2012","Sabaton","Metal As Fuck","Nominado"));
        premios1.add(Arrays.asList("2013","Sabaton","Best Live Band","Nominado"));
        premios1.add(Arrays.asList("2018","Sabaton","Best Live Band","Nominado"));
        
        premios2.add(Arrays.asList("2012","Sabaton","Mejor grupo sueco","Obtenido"));
        premios2.add(Arrays.asList("2012","Sabaton","Mejor actuación en vivo (Sueco)","Obtenido"));
        premios2.add(Arrays.asList("2013","Carolus Rex","Mejor album sueco","Obtenido"));
        premios2.add(Arrays.asList("2013","Sabaton","Mejor actuación en vivo (Sueco)","Obtenido"));
        premios2.add(Arrays.asList("2013","Sabaton","Mejor grupo/artista sueco","Obtenido"));
        
        premios3.add(Arrays.asList("2013","Sabaton","The Year's hard rock/metal","Obtenido"));

        premios4.add(Arrays.asList("2022","Sabaton","Enlightener of the year","Obtenido"));
    }

    @GetMapping({ "/", "/home", "/index" })
    public String home(Model model) {
        model.addAttribute("annos", (LocalDate.now().getYear() - 1999));
        return "indexView";
    }

    @GetMapping("/galeria")
    public String galery(Model model){
        return "galeria-fotosView";
    }

    @GetMapping("/premios")
    public String awards(Model model){
        model.addAttribute("list1", premios1);
        model.addAttribute("list2", premios2);
        model.addAttribute("list3", premios3);
        model.addAttribute("list4", premios4);
        return "palmaresView";
    }
    /*
    @GetMapping("/enlaces")
    public String links(Model model){
        return "enlaces-externosView";
    }
    */
}
