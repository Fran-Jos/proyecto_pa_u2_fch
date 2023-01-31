package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class VehiculoRepoImpl implements IVehiculoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void create(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
		this.entityManager.persist(vehiculo);
		
	}

	@Override
	public Vehiculo read(Integer id) {
		// TODO Auto-generated method stub
		
		return 
				this.entityManager.find(Vehiculo.class, id)
				;
	}

	@Override
	public void update(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vehiculo);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Vehiculo vehiculoo = this.read(id);
		
		this.entityManager.remove(vehiculoo);
		
	}

}
