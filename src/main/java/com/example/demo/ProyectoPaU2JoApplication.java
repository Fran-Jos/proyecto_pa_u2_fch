package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHabitacionService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private ICiudadanoService ciudadanoService;
	@Autowired
	private IEmpleadoService empleadoService;
	@Autowired
	private IHotelService hotelService;
	@Autowired
	private IHabitacionService habitacionService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		
//		Hotel hotel1 = new Hotel();
//		hotel1.setDireccion("El madrigal");
//		hotel1.setNombre("El paraiso");
//		
//		Hotel hotel2 = new Hotel();
//		hotel2.setDireccion("puente 8 , calle 123");
//		hotel2.setNombre("Hilpton colon");
//		
//		Habitacion habitacion = new Habitacion();
//		habitacion.setNumero("AA1");
//		habitacion.setHotel(hotel1);
//		Habitacion habitacion1 = new Habitacion();
//		habitacion1.setNumero("AA2");
//		habitacion1.setHotel(hotel1);
//		Habitacion habitacion2 = new Habitacion();
//		habitacion2.setNumero("AA3");
//		habitacion2.setHotel(hotel1);
//		Habitacion habitacion3 = new Habitacion();
//		habitacion3.setNumero("AA4");
//		habitacion3.setHotel(hotel1);
//		Habitacion habitacion4 = new Habitacion();
//		habitacion4.setNumero("AA5");
//		habitacion4.setHotel(hotel1);
//		
//		
//		List<Habitacion> H = new ArrayList<>(); 
//		H.add(habitacion);
//		H.add(habitacion1);
//		H.add(habitacion2);
//		H.add(habitacion3);
//		H.add(habitacion4);
//		hotel1.setHabitaciones(H );
//	
//		this.hotelService.agregar(hotel1);
		
		
	//	Hotel hotelAA = this.hotelService.buscar(2);
//		
//		Habitacion habitacionNueva = new Habitacion();
//		
//		habitacionNueva.setNumero("AA8");
//		habitacionNueva.setHotel(hotelAA);
//		
//		this.habitacionService.agregar(habitacionNueva);
		
//		Habitacion habitacionNueva = new Habitacion();
//		
//		habitacionNueva.setNumero("AA899");
//	    habitacionNueva.setHotel(hotelAA);
//		
//		this.habitacionService.agregar(habitacionNueva);
		
//		Habitacion habitacion = this.habitacionService.buscar(4);
//		
//		this.habitacionService.borrar(habitacion.getId());
//		
		
		//consultar un hotel e imprimir el nombre del hotel con sus habitaciones
		
		Hotel hotel = this.hotelService.buscar(2);
		
		System.out.println(hotel.getNombre());
		//hotel.getHabitaciones().forEach(t -> System.out.println(t.getNumero() +"---\n" + t.getId() +"---\n"+t.getHotel() ) );
		System.out.println(hotel.getHabitaciones());
		//this.hotelService.agregar(hotel1);
		//this.hotelService.agregar(hotel2);
		
	//	Hotel h = this.hotelService.buscar(1);
		
		//h.setNombre("Oros");
		
		//this.hotelService.modificar(h);
		
		//this.hotelService.borrar(4);
		
		
		

		
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
