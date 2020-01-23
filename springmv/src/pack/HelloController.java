package pack;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.*;  
import org.springframework.ui.ModelMap;
@Controller
@RequestMapping("/Hello")
public class HelloController {
@RequestMapping(method=RequestMethod.GET)
public String printHello(ModelMap model) {
	model.addAttribute("message","Hello Spring MVC Framework");
	return "hello";
}
}
