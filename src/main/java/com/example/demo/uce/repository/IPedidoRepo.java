package com.example.demo.uce.repository;


import com.example.demo.uce.modelo.Pedido;


public interface IPedidoRepo {
	
	   public void insertar( Pedido pedido );
	   
	   public void actualizar( Pedido pedido);

		public  Pedido buscar(Integer id);

		public void eliminar(Integer id);

}
