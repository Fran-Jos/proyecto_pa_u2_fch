package com.example.demo.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name =  "cliente")
public class Cliente {

	@Id
	@GeneratedValue(generator = "seq_cliente" , strategy =  GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cliente" , sequenceName = "seq_cliente" , allocationSize = 1)
	@Column(name = "cli_id")
	private Integer id;
	
	@Column(name = "cli_nombre")
	private String nombre;
	
	@Column(name = "cli_cedula")
	private String cedula;
	
	@Column(name = "cli_edad")
	private Integer edad;
	
	@Column(name = "cli_apellido")
	private String apellido;
	
	@ManyToMany(mappedBy = "clientes" , cascade =  CascadeType.ALL)
	private Set<Vehiculo> vehiculos;
	

	//set and get
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Set<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(Set<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	
	
	
}
