package com.example.demo.controller.admin;

import com.example.demo.modal.Category;
import com.example.demo.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/add-category")
    public String add(Model model){
        Category category = new Category();
        category.setCategoryStatus(true);

        model.addAttribute("category" , category);
        return "admin/category/add";
    }

    @PostMapping("/add-category")
    public String save(@ModelAttribute("category") Category category){
        if(this.categoryService.create(category)){
            return "redirect:/admin/category";
        }else{
            return "admin/category/add";
        }


    }

    @GetMapping("/edit-category/{id}")
    public String edit(Model model , @PathVariable("categoryId") Integer id){
        Category category = this.categoryService.findById(id);
        model.addAttribute("category" , category);
        return "admin/category/edit";
    }
        @GetMapping("/categories")
        public String getCategories(Model model) {
            List<Category> listCate = categoryService.getAll();
            model.addAttribute("listCate", listCate);
            return "categories";
        }
}
