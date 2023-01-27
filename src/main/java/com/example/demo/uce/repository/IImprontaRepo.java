package com.example.demo.uce.repository;


import com.example.demo.uce.modelo.Impronta;


public interface IImprontaRepo {
	
	   public void insertar( Impronta improntaVehicular );
	   
	   public void actualizar(Impronta improntaVehicular);

		public Impronta buscar(Integer id);

		public void eliminar(Integer id);

}
