package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Auto;


public interface IAutoService {

	public void agregar(Auto auto);
	
    public void modificar(Auto auto);

    public Auto buscar(Integer id);
    
    public void eliminar(Integer id );
	
}
