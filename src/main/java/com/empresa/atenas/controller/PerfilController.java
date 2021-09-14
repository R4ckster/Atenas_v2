package com.empresa.atenas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.atenas.model.PerfilModel;
import com.empresa.atenas.service.PerfilService;

@RestController
@RequestMapping("/api")
public class PerfilController {
	@Autowired 
	PerfilService perfilService;
	
	@RequestMapping(value="/perfil", method=RequestMethod.GET)
	private List<PerfilModel> ListarPerfil()   
	{  
		return perfilService.ListarPerfil();  
	}  
	
	@RequestMapping(value="/perfil/{id}", method=RequestMethod.GET)
	private PerfilModel PesquisarPerfilPorID(@PathVariable("id") int id)   
	{  
		return perfilService.PesquisarPerfilPorID(id);  
	}  
	
}
