package br.edu.fatec.mvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HTMLController {

    @GetMapping("/html")
    public String htmlView(Model model) {
        model.addAttribute("message", "Esta é uma página HTML gerada pelo Controller.");
        return "htmlView"; // Isso mapeará para um arquivo HTML chamado "htmlView.html" em seu diretório de templates.
    }
}
