package com.example.demo.controller.admin;

import com.example.demo.modal.Category;
import com.example.demo.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("/category")
    public String index(Model model){
        List<Category> list = this.categoryService.getAll();
        model.addAttribute("list" , list);
        return "admin/category/index";
    }

    @RequestMapping("/add-category")
    public String add(){
        return "admin/category/add";
    }
}
