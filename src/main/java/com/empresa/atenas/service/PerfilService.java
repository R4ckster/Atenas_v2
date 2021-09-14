package com.empresa.atenas.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.empresa.atenas.repository.PerfilRepositorio;
import com.empresa.atenas.model.PerfilModel;

@Service  
public class PerfilService {

	@Autowired
    PerfilRepositorio perfilRepositorio;
	
	
	public List<PerfilModel> ListarPerfil()   
	{  
		List<PerfilModel> perfis = new ArrayList<PerfilModel>();  
		perfilRepositorio.findAll().forEach(x -> perfis.add(x));  
		return perfis.stream().filter(y -> y.isAtivo()).toList();
		  
	}  
	
	public PerfilModel PesquisarPerfilPorID(int id)   
	{
		return perfilRepositorio.findById(id).get();
	}  
	
	public void SalvarPerfil(PerfilModel perfil)   
	{  
		perfilRepositorio.save(perfil);  
	}  
	
	public void AtualizarPerfil(PerfilModel perfil)   
	{  
		perfilRepositorio.save(perfil);  
	}  
}
