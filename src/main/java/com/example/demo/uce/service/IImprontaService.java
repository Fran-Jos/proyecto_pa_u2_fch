package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Impronta;


public interface IImprontaService {

	public void agregar(Impronta improntaVehicular);
	
    public void modificar(Impronta improntaVehicular);

    public Impronta  buscar(Integer id);
    
    public void eliminar(Integer id );
	
}
