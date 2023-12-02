package kiryasay.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    //возвращает необходимое представление
    @GetMapping("/hello-world")//когда пользователь в строке браузера набирает *приложение*/hello-world его запрос приходит в этот метод контроллера
    public String sayHello() {
        return "hello_world";//вовзращаем представление
    }
}
