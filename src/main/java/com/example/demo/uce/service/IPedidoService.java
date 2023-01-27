package com.example.demo.uce.service;


import com.example.demo.uce.modelo.Pedido;


public interface IPedidoService {

	public void agregar(Pedido pedido);
	
    public void modificar(Pedido pedido);

    public Pedido buscar(Integer id);
    
    public void eliminar(Integer id );
	
}
