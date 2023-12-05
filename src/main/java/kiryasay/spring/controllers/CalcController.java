package kiryasay.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
    @GetMapping("/calculator")
    public String calculate(@RequestParam(value = "a", required = false) int a,
                            @RequestParam(value = "b", required = false) int b,
                            @RequestParam(value = "action", required = false) String action,
                            Model model){
            double c = 0;
            System.out.println("a = " + a + "b = " + "action: " + action);
            switch (action) {
                case "multiplication":
                    model.addAttribute("answer", a + " * " + b + " = " + a * b);
                    break;
                case "additional":
                    c = a + b;
                    model.addAttribute("answer", a + " + " + b + " = " + c);
                    break;
                case "subtraction":
                    c = a - b;
                    model.addAttribute("answer", a + " - " + b + " = " + c);
                    break;
                case "division":
                    c = (double) a /b;
                    model.addAttribute("answer", a + " / " + b + " = " + c);
                    break;
                default:
                    model.addAttribute("answer", "wrong action");

            }
        return "calc/calc";
    }
}
