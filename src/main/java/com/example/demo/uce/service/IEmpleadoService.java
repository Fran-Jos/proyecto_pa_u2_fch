package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Empleado;


public interface IEmpleadoService {

	public void agregar(Empleado empleado);
    public void modificar(Empleado empleado);

    //CRUD siempre por PK
    public Empleado buscar(Integer id);
    //CRUD siempre por PK
    public void eliminar(Integer id );
}
