package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	
	
	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.create(vehiculo);
		
	}

	@Override
	public Vehiculo buscar(Integer id) {
		// TODO Auto-generated method stub
		return 
				this.iVehiculoRepo.read(id)
				;
	}

	@Override
	public void modificar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
		this.iVehiculoRepo.update(vehiculo);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
		this.iVehiculoRepo.delete(id);
	}

}
