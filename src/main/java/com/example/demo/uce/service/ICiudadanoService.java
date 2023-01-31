package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Ciudadano;


public interface ICiudadanoService {

	public void agregar(Ciudadano ciudadano);
    public void modificar(Ciudadano ciudadano);

    //CRUD siempre por PK
    public Ciudadano buscar(Integer id);
    //CRUD siempre por PK
    public void eliminar(Integer id );
}
