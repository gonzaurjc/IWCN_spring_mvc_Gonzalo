package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.entity.Producto;
import com.example.demo.service.IProductoService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class ProductosController {

	@Autowired
	private IProductoService productoService;
        
	@GetMapping("/productos")
	public String findAll(Model model) {

		model.addAttribute("productos", productoService.findAll());
		model.addAttribute("producto", new Producto());
		return "producto";

	}
       
        @RequestMapping("/listado")
	public ModelAndView listado() {
		return new ModelAndView("listado").addObject("productoService", productoService.findAll());		
	}
        
        @PostMapping("/insertar")
	public String save(@Valid Producto producto, BindingResult result) {
		if (result.hasErrors()) {
                        //System.out.println("error");
                }
		productoService.save(producto);
		return "redirect:/productos";
	}
        
        @GetMapping("/insertar") 
	public ModelAndView insertar(Producto producto) {
		return new ModelAndView("insertar");
	}
        
        @RequestMapping("/eliminar")
	public ModelAndView delete(@RequestParam int id) {
            productoService.delete(id);
            return new ModelAndView("listado").addObject("productoService", productoService.findAll());
	}
        
        @RequestMapping("/productoIndividual")
	public ModelAndView productoIndividual(@RequestParam int id) {
		return new ModelAndView("productoIndividual").addObject("productoService", productoService.getProducto(id));		
	}
}