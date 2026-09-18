package com.example.demo.test02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test02Controller {

	@GetMapping("/test02_View_hello")
	public String Hello() {
		return "view01_test02_hello";
	}


///////////////////////////////////////////////////////////

	@GetMapping("/test02_View_forward")
	public String Forward() {
		return "view01_test02_forward";
	}

	@GetMapping("/test02_forward")
    public String forward() {
        return "forward:/test02_View_forward";
    }
///////////////////////////////////////////////////////////

	@GetMapping("/test02_View_redirect")
	public String Redirect() {
		return "view01_test02_redirect";
	}

    @GetMapping("/test02_redirect")
    public String redirect() {
        return "redirect:/test02_View_redirect";
    }


}