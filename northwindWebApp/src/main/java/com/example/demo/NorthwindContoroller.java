package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/memo")
public class NorthwindContoroller {

	@Autowired
    ProductService service;

	@GetMapping("")
	String list(Model model) {
	 List<Product> products = service.findAll();
	model.addAttribute("products", products);
	return "memo/index";
	}

	@GetMapping("new")
    public String newCreate(Model model) {
        return "memo/new";
    }

	@GetMapping("edit")
    public String edit(Model model) {
        return "memo/edit";
    }

	@GetMapping("delete")
    public String delete(Model model) {
        return "memo/delete";
    }
}

