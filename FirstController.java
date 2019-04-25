package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/memo")
public class FirstController {

//	@Autowired
//    private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public String test(Model model) {
//		model.addAttribute("name", "名前");
//		model.addAttribute("get", "GET /memo");
//		model.addAttribute("post", "POST /memo");
		return "memo/index";
	}


//	@GetMapping("/new")
//    public List<Product> getAll(){
//        return productService.findAll();
//    }
//
//    @PostMapping("/new")
//    public Product post(Product product){
//        return productService.save(product);
//    }


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


