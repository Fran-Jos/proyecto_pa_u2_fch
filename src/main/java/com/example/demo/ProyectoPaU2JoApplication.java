package com.example.demo;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.service.IAutorService;


@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

@Autowired
private IAutorService autorService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
//		Autor a1 = new Autor();
//		a1.setNombre("Francisco");
//	
//		
//		Libro l1 = new Libro();
//		l1.setEditorial("vvaks");
//		l1.setNombre("la chica del tren ");
//		
//		Libro l2 = new Libro();
//		
//		l2.setEditorial("jhjdsj");
//		l2.setNombre("it");
//		
//		Set<Libro>libros = new HashSet<>();
//		
//		libros.add(l2);
//		libros.add(l1);
//		
//		
//		
//		a1.setLibros(libros);
//		
//		this.autorService.agregar(a1);
//		
//	
	
		Autor autor1 = new Autor();
		Autor autor2 = new Autor();
		Autor autor3 = new Autor();
		Autor autor4 = new Autor();
		Autor autor5 = new Autor();
		autor1.setNombre("Wuillian");
		autor2.setNombre("fran");
		autor3.setNombre("jose");
		autor4.setNombre("luis");
		autor5.setNombre("Julio");
		Set<Libro> libros1 = new HashSet<>();
		Set<Libro> libros2 = new HashSet<>();
		Libro libro1 = new Libro();
		libro1.setNombre("P. Web");
		libro1.setEditorial("Pqq");
		Set<Autor> autors1 = new HashSet<>();
		autors1.add(autor1);
		autors1.add(autor3);
		libro1.setAutores(autors1);
		libros1.add(libro1);
		Libro libro2 = new Libro();
		libro2.setNombre("Redes");
		libro2.setEditorial("Patito");
		Set<Autor> autors2 = new HashSet<>();
		autors2.add(autor1);
		autors2.add(autor4);
		autors2.add(autor5);
		libro2.setAutores(autors1);
		libros2.add(libro2);
		autor1.setLibros(libros2);
		this.autorService.agregar(autor1);
		
	
	}

}
