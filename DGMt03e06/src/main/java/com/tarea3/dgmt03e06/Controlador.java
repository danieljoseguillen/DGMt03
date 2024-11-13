package com.tarea3.dgmt03e06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Controlador {
    int num1 = 0, num2 = 0, step = 0;
    String result;

    @GetMapping({ "/", "/index", "/home" })
    public String showIndex(Model model) {
        model.addAttribute("n1", num1);
        model.addAttribute("n2", num2);
        model.addAttribute("etapa", step);
        model.addAttribute("result", result);
        return "indexView";
    }

    @GetMapping("/digito/{number}")
    public String addDigit(@PathVariable Integer number) {
        if (step == 0) {
            try {
                if (num1 == 0) {
                    num1 = number;
                } else {
                    num1 = Integer.parseInt(String.valueOf(num1) + String.valueOf(number));
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (step == 1) {
            try {
                if (num2 == 0) {
                    num2 = number;
                } else {
                    num2 = Integer.parseInt(String.valueOf(num2) + String.valueOf(number));
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return "redirect:/";
    }

    @GetMapping("/suma")
    public String sumar(Model model) {
        if (step < 1) {
            step++;
        }
        return "redirect:/";
    }

    @GetMapping("/clear")
    public String restaurar(Model model) {
        num1 = 0;
        num2 = 0;
        step = 0;
        result = "";
        return "redirect:/";
    }

    @GetMapping("/igual")
    public String resultado(Model model) {
        if (step == 1) {
            step = 2;
            result = String.valueOf(num1 + num2);
        }
        return "redirect:/";
    }

}
