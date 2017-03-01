package com.mobiles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mobiles.model.Category;
import com.mobiles.service.CategoryService;

@Controller
public class CategoryController 
{
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("/categoryPage")
	public String getCategoryPage(Model model)
	{
		model.addAttribute("category", new Category());
		model.addAttribute("categoryList", categoryService.fetchAllCategories());
		return "categories";
	}
	
	@RequestMapping("/addCategory")
	public String addCategory(@ModelAttribute("category")Category category)
	{
		categoryService.addCategory(category);
		return "redirect:/categoryPage";
	}
	
	@RequestMapping("/updateCategoryById-{categoryId}")
	public String updateCategory(Model model,@PathVariable("categoryId") int categoryId)
	{
		model.addAttribute("category", categoryService.getCategoryById(categoryId));
		return "categories";
	}
	
	@RequestMapping("/deleteCategoryById-{categoryId}")
	public String deleteCategory(@PathVariable("categoryId") int categoryId)
	{
		categoryService.deleteCategory(categoryId);
		return "redirect:/categoryPage";
	}
}
