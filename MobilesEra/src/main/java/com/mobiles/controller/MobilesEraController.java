package com.mobiles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mobiles.service.CategoryService;
import com.mobiles.service.SubCategoryService;

@Controller
public class MobilesEraController 
{
	@Autowired
	CategoryService categoryService;
	
	/*@Autowired
	SubCategoryService subCategoryService;*/
		
	@RequestMapping("/")
	public String getHome(Model model)
	{
		model.addAttribute("categoryList", categoryService.fetchAllCategories());
		/*model.addAttribute("subCategoryList", subCategoryService.fetchAllSubCategories());*/
		return "home";
	}
	
	
}
