package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Auto;


public interface IAutoRepo {
	
	   public void insertar( Auto auto );
	   
	   public void actualizar(Auto auto);

		public Auto buscar(Integer id);

		public void eliminar(Integer id);

}
