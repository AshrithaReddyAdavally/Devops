package pack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
	@RequestMapping("/")
	public String display()
	{
		return "INDEX";
	}

}