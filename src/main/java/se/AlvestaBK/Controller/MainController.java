package se.AlvestaBK.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String getMainPage(){
        return "Page_AlvestaBK_start_side/AlvestaBKStartSida";
    }

    
}