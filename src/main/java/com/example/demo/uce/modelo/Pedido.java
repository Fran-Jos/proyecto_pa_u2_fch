package com.example.demo.uce.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Column(name = "pedi_codigo")
	private String codigo;
	
	@Column(name = "pedi_descripcion")
	private String descripcion;
	
	@Id
	@GeneratedValue(generator = "seq_pedido" , strategy =  GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_pedido", sequenceName = "seq_pedido" ,allocationSize = 1)
	@Column(name = "pedi_id")
	private Integer id;
	
	@Column(name = "pedi_fecha")
	private LocalDateTime fecha;
	
	@ManyToOne
	@JoinColumn(name = "pedi_id_cli")
	private Cliente cliente;
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}
