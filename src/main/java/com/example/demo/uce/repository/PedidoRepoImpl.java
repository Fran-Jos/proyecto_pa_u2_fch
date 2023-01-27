package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;


import com.example.demo.uce.modelo.Pedido;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PedidoRepoImpl implements IPedidoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Pedido pedido) {
		// TODO Auto-generated method stub
		
		//this.entityManager.persist(pedido);
		
	}

	@Override
	public void actualizar(Pedido pedidoe) {
		// TODO Auto-generated method stub
		
		//this.entityManager.merge(pedidoe);
	}

	@Override
	public Pedido buscar(Integer id) {
		// TODO Auto-generated method stub
		return 
				null
				//this.entityManager.find(Pedido.class, id)
				;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Pedido pedido = this.buscar(id);
		
		//this.entityManager.remove(pedido);
	}

}
