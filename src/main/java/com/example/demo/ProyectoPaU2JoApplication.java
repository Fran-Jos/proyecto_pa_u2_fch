package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private ICiudadanoService ciudadanoService;
	@Autowired
	private IEmpleadoService empleadoService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu= new Estudiante();
		//estu.setId(1);
		estu.setNombre("Francisco");
		estu.setApellido("Chanataxi");
		estu.setCedula("1721483323");
		estu.setCiudad("Quito");
		estu.setGenero("Masculino");
		
	
		this.estudianteService.agregar(estu);
		
		
		
		
		Empleado empl= new Empleado();
		//empl.setCiudadano(ciu);
		empl.setSalario(new BigDecimal(20));
		empl.setFechaIngreso(LocalDateTime.now());
		this.empleadoService.agregar(empl);
		
		Ciudadano ciu= new Ciudadano();
		ciu.setApellido("Gabriela");
		ciu.setApellido("Taco");
		ciu.setEmpleado(empl);
	
		this.ciudadanoService.agregar(ciu);
		
	
	}

}
