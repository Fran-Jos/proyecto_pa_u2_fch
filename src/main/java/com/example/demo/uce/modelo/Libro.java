package com.example.demo.uce.modelo;


import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")

//tabla PRINCIPAL

public class Libro {

	@Id
	@GeneratedValue(generator = "seq_libro" , strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_libro" , allocationSize = 1,sequenceName = "seq_libro")
	@Column(name = "lib_id")
	private Integer id;
	@Column(name = "lib_nombre")
	private String nombre;
	@Column(name = "lib_editorial")
	private String editorial;
	
	// para este mapeo directo many to many 
	// ya no se ocupa la lista sino set
	
	//el nombre del joinTable se pone primero el nombre de la clase principal
	// y luego la secundaria
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "libro_autor" , //nombre de la tabla de rompimiento
	joinColumns =@JoinColumn(name = "liau_id_libro"), // la columna FK de libro
	inverseJoinColumns = @JoinColumn(name = "liau_id_autor" )) // la columna fk de autor
	//la columna FK del libro
	private Set<Autor>autores;
	
	
	
	public Set<Autor> getAutores() {
		return autores;
	}
	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}
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
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	
	
	
}
