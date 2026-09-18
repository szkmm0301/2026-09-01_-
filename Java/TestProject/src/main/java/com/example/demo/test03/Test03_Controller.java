package com.example.demo.test03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

@Controller
public class Test03_Controller {

	@GetMapping("/test03_forward")
	public String forward(HttpServletRequest request) {
//                            ↑ サーバーからデータを貰っている

	    request.setAttribute("message", "こんにちは");

	    return "forward:/test03_view"; // ←URLパターンを指定している
	}

	@GetMapping("/test03_view")
	public String view(HttpServletRequest request, Model model) {

	    String message = (String) request.getAttribute("message");

	    System.out.println(message);

	    model.addAttribute("message", message);

	    return "test03/test03";// フォルダ名/HTML名
	}

}
