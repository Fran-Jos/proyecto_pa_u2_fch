package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.List;
//import java.util.ListIterator;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Auto;
import com.example.demo.uce.modelo.Impronta;
import com.example.demo.uce.service.IAutoService;

//import com.example.demo.uce.modelo.Ciudadano;
//import com.example.demo.uce.modelo.Empleado;
//import com.example.demo.uce.modelo.Estudiante;
//import com.example.demo.uce.modelo.Habitacion;
//import com.example.demo.uce.modelo.Hotel;
//import com.example.demo.uce.service.ICiudadanoService;
//import com.example.demo.uce.service.IEmpleadoService;
//import com.example.demo.uce.service.IEstudianteService;
//import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

//	@Autowired
//	private IEstudianteService estudianteService;
//	@Autowired
//	private ICiudadanoService ciudadanoService;
//	@Autowired
//	private IEmpleadoService empleadoService;
//	@Autowired
//	private IHotelService hotelService;
//	
	@Autowired
	private IAutoService autoService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	 
	  Auto auto = new Auto();
	  auto.setColor("rojo");
	  auto.setMarca("Toyota");
	  auto.setModelo("Hilux");
	  auto.setPlaca("PUM-213");
	  
	  Auto auto1 = new Auto();
	  auto1.setColor("azul");
	  auto1.setMarca("Toyota");
	  auto1.setModelo("Corolla");
	  auto1.setPlaca("MMA-332");
	  
	  Auto auto2 = new Auto();
	  auto2.setColor("rojo");
	  auto2.setMarca("Chevroleth");
	  auto2.setModelo("xaaaa");
	  auto2.setPlaca("MRT-873");
	  
	  Impronta improntaVehicular = new Impronta();
	  improntaVehicular.setNumMotor("122121");
	  improntaVehicular.setSerie("aa112ss");
	  improntaVehicular.setAuto(auto);
	  
	  Impronta improntaVehicular1 = new Impronta();
	  improntaVehicular1.setNumMotor("87731");
	  improntaVehicular1.setSerie("wea12xz");
	  improntaVehicular1.setAuto(auto1);
	  
	  Impronta improntaVehicular2 = new Impronta();
	  improntaVehicular2.setNumMotor("77373");
	  improntaVehicular2.setSerie("mmew32");
	  improntaVehicular2.setAuto(auto2);
	  
	  
	  auto.setImprontaVehicular(improntaVehicular);
	  auto1.setImprontaVehicular(improntaVehicular1);
	  auto2.setImprontaVehicular(improntaVehicular2);
	  
	  this.autoService.agregar(auto);
	  this.autoService.agregar(auto1);
	  this.autoService.agregar(auto2);
	  
	  Auto autoN = this.autoService.buscar(6);
	  
	  autoN.setColor("negro");
	  autoN.setMarca("Ford");
	  
	  this.autoService.modificar(autoN);
	  
	  this.autoService.eliminar(7);
	  this.autoService.eliminar(8);
	  this.autoService.eliminar(9);
	  

		

	
	}

}
