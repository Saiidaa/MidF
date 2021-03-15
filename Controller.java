package Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class Controller {
    @RequestMapping(method = RequestMethod.GET)
    public String start(Model model){
        return "index";
}
