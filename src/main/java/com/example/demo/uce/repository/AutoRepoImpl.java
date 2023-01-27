package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Auto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutoRepoImpl implements IAutoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Auto auto) {
		// TODO Auto-generated method stub
		
		this.entityManager.persist(auto);
		
	}

	@Override
	public void actualizar(Auto auto) {
		// TODO Auto-generated method stub
		
		this.entityManager.merge(auto);
	}

	@Override
	public Auto buscar(Integer id) {
		// TODO Auto-generated method stub
		return 
				this.entityManager.find(Auto.class, id)
				;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Auto auto = this.buscar(id);
		
		this.entityManager.remove(auto);
	}

}
