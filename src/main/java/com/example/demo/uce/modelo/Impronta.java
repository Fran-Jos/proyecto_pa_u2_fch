package com.example.demo.uce.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "impronta_vehicular")
@Entity
public class Impronta {
	
	
	@GeneratedValue(generator = "seq_Imp" , strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_Imp" , sequenceName = "seq_Imp" , allocationSize = 1)
	@Id
	@Column(name ="Imp_id")
	private Integer id;
	
	@Column(name ="Imp_serie")
	private String serie;
	
	@Column(name ="Imp_numMotor")
	private String numMotor;
	
	@OneToOne
	@JoinColumn(name = "Imp_id_auto")
	private Auto auto;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getNumMotor() {
		return numMotor;
	}

	public void setNumMotor(String numMotor) {
		this.numMotor = numMotor;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	
	
	
	
	
	
}
