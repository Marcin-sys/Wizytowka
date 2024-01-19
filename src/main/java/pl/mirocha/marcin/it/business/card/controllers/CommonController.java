package pl.mirocha.marcin.it.business.card.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {
    @RequestMapping(path = {"/main", "/", "/index"}, method = RequestMethod.GET)
    public String main() {
        return "main";
    }

    @RequestMapping(path = "/contact", method = RequestMethod.GET)
    public String contact() {
        return "contact";
    }

    @RequestMapping(path = "/aboutMe", method = RequestMethod.GET)
    public String aboutMe() {
        return "aboutMe";
    }
}
