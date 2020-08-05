package wx.cjw.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MenuController {

    @GetMapping("/demo")
    public String demo() {
        return "frp is success!";
    }

    @GetMapping("/json")
    public void json(){

    }
}
