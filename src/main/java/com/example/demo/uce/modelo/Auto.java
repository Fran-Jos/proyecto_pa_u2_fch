package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "auto")
@Entity
public class Auto {
	
	@Id
	@Column(name = "aut_id")
	@GeneratedValue(generator = "seq_auto", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_auto" , sequenceName = "seq_auto" , allocationSize = 1)
	private Integer id;
	
	@Column(name = "aut_marca")
	private String marca; 
	
	@Column(name = "aut_color")
	private String color;
	
	@Column(name = "aut_modelo")
	private String modelo;
	
	@Column(name = "aut_placa")
	private String placa;
	
	@OneToOne(mappedBy = "auto" , cascade =  CascadeType.ALL)
	private Impronta improntaVehicular;
	

	
	
	public Impronta getImprontaVehicular() {
		return improntaVehicular;
	}



	public void setImprontaVehicular(Impronta improntaVehicular) {
		this.improntaVehicular = improntaVehicular;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
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



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}



	@Override
	public String toString() {
		return "Auto [id=" + id + ", marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", placa=" + placa
				+ "]";
	}
	
	
	

}
