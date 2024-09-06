package com.example.demo.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ProductController {
    @RequestMapping("/product")
    public String index(){
        return "admin/product/index";

    }
    @RequestMapping("/product/product-add")
    public String add(){
        return "admin/product/add";

    }


}
