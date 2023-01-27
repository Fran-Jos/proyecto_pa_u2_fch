package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Auto;
import com.example.demo.uce.repository.IAutoRepo;

@Service
public class AutoServiceImpl implements IAutoService {

	@Autowired
	private IAutoRepo autoRepo;
	
	@Override
	public void agregar(Auto auto) {
		// TODO Auto-generated method stub
		
		this.autoRepo.insertar(auto);
	}

	@Override
	public void modificar(Auto auto) {
		// TODO Auto-generated method stub
		this.autoRepo.actualizar(auto);
	}

	@Override
	public Auto buscar(Integer id) {
		// TODO Auto-generated method stub
		return 
				this.autoRepo.buscar(id)
				;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
	
		
		this.autoRepo.eliminar(id);
		
	}

}
