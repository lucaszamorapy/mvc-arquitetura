package br.edu.fatec.mvcDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class JSONController {

    @GetMapping("/json")
    public Map<String, String> jsonData() {
        Map<String, String> data = new HashMap<>();
        data.put("chave", "valor");
        return data;
    }
}
