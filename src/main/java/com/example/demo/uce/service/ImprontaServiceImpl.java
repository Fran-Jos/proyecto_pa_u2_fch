package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Impronta;
import com.example.demo.uce.repository.IImprontaRepo;

@Service
public class ImprontaServiceImpl  implements IImprontaService{

	@Autowired
	private IImprontaRepo iImprontaRepo;
	
	
	@Override
	public void agregar(Impronta improntaVehicular) {
		// TODO Auto-generated method stub
	
		this.iImprontaRepo.insertar(improntaVehicular);
	}

	@Override
	public void modificar(Impronta improntaVehicular) {
		// TODO Auto-generated method stub
		
		this.iImprontaRepo.actualizar(improntaVehicular);
	}

	@Override
	public Impronta buscar(Integer id) {
		// TODO Auto-generated method stub
		return
				 this.iImprontaRepo.buscar(id)
				;
	}

	
	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iImprontaRepo.eliminar(id);
	}

	
	
	
}
