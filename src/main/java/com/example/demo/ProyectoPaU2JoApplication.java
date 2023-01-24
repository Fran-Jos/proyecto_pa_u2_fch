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
	
		
		

		
//		Ciudadano ciu= new Ciudadano();
//		ciu.setApellido("Gabriela");
//		ciu.setApellido("Taco");
//		
//		
//		Empleado empl= new Empleado();
//		empl.setCiudadano(ciu);
//		empl.setSalario(new BigDecimal(20));
//		empl.setFechaIngreso(LocalDateTime.now());
//		empl.setCiudadano(ciu);
//		
//		ciu.setEmpleado(empl);
//		
//		this.ciudadanoService.agregar(ciu);
		
//	Ciudadano ciudadano2 = new Ciudadano();
//	ciudadano2.setApellido("Andrade");
//	ciudadano2.setNombre("Jose");
//	
//	Empleado empl1= new Empleado();
//	empl1.setCiudadano(ciudadano2);
//	empl1.setSalario(new BigDecimal(20));
//	empl1.setFechaIngreso(LocalDateTime.now());
//	empl1.setCiudadano(ciudadano2);
//	
//	this.empleadoService.agregar(empl1);

		
	
	}

}
