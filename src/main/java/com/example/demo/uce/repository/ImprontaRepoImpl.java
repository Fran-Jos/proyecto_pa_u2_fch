package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;


import com.example.demo.uce.modelo.Impronta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ImprontaRepoImpl implements IImprontaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Impronta improntaVehicular) {
		// TODO Auto-generated method stub
		
		this.entityManager.persist(improntaVehicular);
		
	}

	@Override
	public void actualizar(Impronta improntaVehicular) {
		// TODO Auto-generated method stub
		
		this.entityManager.merge(improntaVehicular);
	}

	@Override
	public Impronta buscar(Integer id) {
		// TODO Auto-generated method stub
		return 
				this.entityManager.find(Impronta.class, id)
				;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
		this.entityManager.remove(id);
	}

}
