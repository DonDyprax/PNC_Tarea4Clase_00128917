package com.uca.capas.Tarea4Clase.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.Tarea4Clase.domain.Product;

@Controller
public class MainController {
	
	@RequestMapping("/producto") 
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("producto");
		mav.addObject("product", new Product());
		return mav;
	}
	
	@RequestMapping("/validacion")
	public ModelAndView procesarProducto(@Valid @ModelAttribute Product product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("producto");
		} else {
			mav.addObject("code", product.getCode());
			mav.addObject("name", product.getName());
			mav.addObject("brand", product.getBrand());
			mav.addObject("description", product.getDescription());
			mav.addObject("stock", product.getStock());
			mav.addObject("date", product.getDate());
			mav.setViewName("exito");
		}
		
		
		
		return mav;
	}
}
