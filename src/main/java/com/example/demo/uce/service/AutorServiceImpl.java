package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.repository.IautorRepo;

@Service
public class AutorServiceImpl implements IAutorService{

	@Autowired
	private IautorRepo iautorRepo;
	
	
	@Override
	public void agregar(Autor autor) {
		// TODO Auto-generated method stub
		
		this.iautorRepo.insertar(autor);
	}

}
