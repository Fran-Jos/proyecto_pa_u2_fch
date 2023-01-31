package com.example.demo.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


//-- TABLA PRINCIPAL--


@Entity
@Table(name =  "vehiculo")
public class Vehiculo {

	@Id
	@GeneratedValue(generator = "seq_veh" , strategy =  GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_veh" , sequenceName = "seq_veh" , allocationSize = 1)
	@Column(name = "vehi_id")
	private Integer id;
	
	@Column(name = "vehi_placa")
	private String placa;
	
	@Column(name = "vehi_marca")
	private String marca;
	
	@Column(name = "vehi_color")
	private String color;
	
	@Column(name = "vehi_modelo")
	private String modelo;
	
	@ManyToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinTable(name = "vehiculo_cliente" , 
	joinColumns = @JoinColumn(name = "vehcli_id_vehiculo"),
	inverseJoinColumns = @JoinColumn(name = "vehcli_id_cliente"))
	private Set<Cliente> clientes;
	
	//get and set

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
	
}
