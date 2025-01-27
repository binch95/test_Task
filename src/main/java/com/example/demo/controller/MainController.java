package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ArticleService;
import com.example.demo.vo.Article;

@Controller
public class MainController {
	ArticleService articleService;
	
	@RequestMapping("/usr/home/main")
	private String showmain(Model model) {
		List<Article> articles = articleService.getArticles();

		model.addAttribute("articles", articles);
		return "/usr/home/main";

	}
	
	@RequestMapping("/")
	public String showRoot() {

		return "redirect:/usr/home/main";
	}
	

}
