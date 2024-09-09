package com.example.demo.controller.admin;

import com.example.demo.modal.Category;
import com.example.demo.modal.Product;
import com.example.demo.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class ProductController {
    @Autowired

    private CategoryService categoryService;
    @RequestMapping("/product")
    public String index(){
        return "admin/product/index";

    }
    @RequestMapping("/product-add")
    public String add(Model model){
        Product product = new Product();
        model.addAttribute("product" , product);
        List<Category> listCate = this.categoryService.getAll();
        model.addAttribute("listCate" , listCate);

        return "admin/product/add";

    }

    @PostMapping("/product-add")
    public String save(@ModelAttribute("product") Product product , @RequestParam("/file") MultizpartFile file){

        return "redirect:/admin/product";

    }


}
