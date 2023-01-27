package com.example.demo.uce.service;


import com.example.demo.uce.modelo.Cliente;


public interface IClienteService {

	public void agregar(Cliente cliente);
	
    public void modificar(Cliente cliente);

    public Cliente buscar(Integer id);
    
    public void eliminar(Integer id );
	
}
