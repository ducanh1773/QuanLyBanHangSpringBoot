package com.example.demo.controller.admin;

import com.example.demo.modal.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ProductController {
    @RequestMapping("/product")
    public String index(){
        return "admin/product/index";

    }
    @RequestMapping("/product/product-add")
    public String add(Model model){
        Product product = new Product();
        model.addAttribute("product" , model);
        return "admin/product/add";

    }


}
