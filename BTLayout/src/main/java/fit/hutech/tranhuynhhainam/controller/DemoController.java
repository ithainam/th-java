package fit.hutech.tranhuynhhainam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/")
	public String show() {
		return "layouts/main-layout";
		
	}
	
	@RequestMapping("/home")
	public String showhome() {
		return "home";
		
	}
	
	@RequestMapping("/contact")
	public String showcontact() {
		return "contact";
		
	}
	
	@RequestMapping("/product")
	public String showproduct() {
		return "product";
		
	}

}
