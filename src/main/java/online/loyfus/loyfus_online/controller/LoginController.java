package online.loyfus.loyfus_online.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Certifique-se de que o login.html está na pasta correta
    }
}
