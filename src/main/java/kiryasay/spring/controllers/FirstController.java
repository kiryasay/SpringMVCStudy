package kiryasay.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/first")//теперь к каждому запросу ниже ссылка будет как /first/hello или /first/goodbye
public class FirstController {
    /*HttpServletRequest содержит в себе всю информация о http запросе а не только параметры
    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request){
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        System.out.println("Hello " + name + " "+ surname);
        return "first/hello";
    }
     */
    //аннтоация получает только параметры, но если Get запрос был без параметров то выдаст ошибку а не null на месте параметров
    //чтобы избежаьт ошибка можно добавить required false
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname",required = false) String surname,
                            Model model){
        //System.out.println("Hello " + name + " "+ surname);
        model.addAttribute("message","Hello " + name + " "+ surname );//передаю данные в модель как ключ значение
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String goodByePage(){
        return "first/goodbye";
    }
}
