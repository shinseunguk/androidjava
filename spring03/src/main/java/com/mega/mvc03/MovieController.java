package com.mega.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("login.do")
	public void idchk(String id, Model model) {
		
		String idArray[]= {"root","admin","apple","melon","mint"};
		String login = "<div style='color:red	;'>사용가능</div>";
		for(int i=0; i<idArray.length; i++) {
			if(idArray[i].equals(id)) {
				login = "<div style='color:blue;'>사용 불가능</div>";
				
			}
			System.out.println(login);
			model.addAttribute("login",login);
		}
		
	}
	
	
	@RequestMapping("reply.do")
	public void reply(String reply,Model model) {
		//db처리 했음.
		//view로 넘어감.
		model.addAttribute("reply", reply);
		System.out.println(reply);
	}
	
	@RequestMapping("movie.do")
	public String moive(String title, int price, Model model) {
		
		System.out.println(title);
		System.out.println(price);

		
		Sale sale = new Sale();
		
		int salePrice = sale.sale(price);
		
		System.out.println(salePrice);
		
		model.addAttribute("title", title);
		model.addAttribute("price", salePrice);
		
		return "like";
		
	}
}
