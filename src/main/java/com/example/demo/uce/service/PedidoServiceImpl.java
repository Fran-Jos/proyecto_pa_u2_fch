package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.uce.modelo.Pedido;

import com.example.demo.uce.repository.IPedidoRepo;


@Service
public class PedidoServiceImpl implements IPedidoService {

	@Autowired
	private IPedidoRepo iPedidoRepo;
	
	@Override
	public void agregar(Pedido pedido) {
		// TODO Auto-generated method stub
		
		this.iPedidoRepo.insertar(pedido);
	}

	@Override
	public void modificar(Pedido pedido) {
		// TODO Auto-generated method stub
		
		this.iPedidoRepo.actualizar(pedido);
	}

	@Override
	public Pedido buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPedidoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
		this.iPedidoRepo.eliminar(id);
	}

}
