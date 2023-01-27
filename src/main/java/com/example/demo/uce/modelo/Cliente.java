package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(generator = "seq_cliente", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_cliente" , sequenceName = "seq_cliente",allocationSize = 1)
	@Column(name = "cli_id")
	private Integer id;
	
	@Column(name = "cli_nombre")
	private String nombre;
	
	@Column(name = "cli_apellido")
	private String apellido;
	
	@Column(name = "cli_edad")
	private Integer edad;
	
	@Column(name = "cli_cedula")
	private String cedula;
	
	@OneToMany(mappedBy = "cliente" , cascade = CascadeType.ALL , fetch = FetchType.LAZY )
	private List<Pedido> pedido;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}
	
	
	
}
