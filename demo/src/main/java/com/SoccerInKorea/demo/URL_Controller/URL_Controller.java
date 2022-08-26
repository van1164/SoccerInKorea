package com.SoccerInKorea.demo.URL_Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class URL_Controller {
    @GetMapping("Main")
    public String Main(Model model){
        model.addAttribute("data","start");
        return "Main";
    }
    @GetMapping("TEMP")
    public String TEMP(@RequestParam("name") String name,Model model){
        model.addAttribute("data","start");
        return "TEMP";
    }

    @GetMapping("GET")
    public  String GET(@RequestParam("name") String name, Model mod){
        mod.addAttribute("name",name);
        return "GET";
        }

}
