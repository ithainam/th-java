package fit.hutech.tranhuynhhainam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
	
//	@RequestMapping("/hello")
//	public String showHello() {
//		return "helloworld";
//	}
	
	
	
	@RequestMapping(value= {"/", "/hello"})
//	@RequestMapping("/")
	public String showHello1() {
		return "helloworld";
	}
	
	@GetMapping("/nhapten")
	public String NhapTen() {
		return "nhapten";
	}
	
	@PostMapping("/nhanten")
	public String XuatTen(HttpServletRequest request, ModelMap modelmap)
	{
		String ten =request.getParameter("name");
		modelmap.addAttribute("NAME", ten);
		return "xuatten";
		
	}


}
