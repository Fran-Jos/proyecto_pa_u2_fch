package com.example.demo.service;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {

public void agregar(Vehiculo vehiculo);
public Vehiculo buscar(Integer id);
public void modificar(Vehiculo vehiculo);
public void eliminar(Integer id);


	
}
