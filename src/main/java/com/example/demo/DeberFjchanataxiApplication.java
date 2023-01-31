package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class DeberFjchanataxiApplication implements CommandLineRunner {
	
	@Autowired
	private IVehiculoService iVehiculoService;

	public static void main(String[] args) {
		SpringApplication.run(DeberFjchanataxiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		// ---CREACIÓN DE VEHICULOS-----
		
		Vehiculo v1 = new Vehiculo();
		v1.setColor("negro");
		v1.setMarca("Toyota");
		v1.setModelo("corolla");
		v1.setPlaca("PUT-0023");
		Vehiculo v2 = new Vehiculo();
		v2.setColor("blanco");
		v2.setMarca("Toyota");
		v2.setModelo("Hilux");
		v2.setPlaca("RVF-0773");
		Vehiculo v3 = new Vehiculo();
		v3.setColor("negro");
		v3.setMarca("chevroleth");
		v3.setModelo("aveo");
		v3.setPlaca("TLK-2344");
		Vehiculo v4 = new Vehiculo();
		v4.setColor("blanco");
		v4.setMarca("chevroleth");
		v4.setModelo("dimax");
		v4.setPlaca("OTE-7663");
		Vehiculo v5 = new Vehiculo();
		v5.setColor("rojo");
		v5.setMarca("volfwagen");
		v5.setModelo("gol");
		v5.setPlaca("CBT-9923");
		Vehiculo v6 = new Vehiculo();
		v6.setColor("azul");
		v6.setMarca("nizzan");
		v6.setModelo("razt");
		v6.setPlaca("PFT-0863");
		
		//---CREACIÓN DE CLIENTES-----
		
		Cliente c1 = new Cliente();
		c1.setApellido("Nuñez");
		c1.setCedula("1244322223");
		c1.setEdad(24);
		c1.setNombre("Marco");
		Cliente c2 = new Cliente();
		c2.setApellido("Chanataxi");
		c2.setCedula("176654349");
		c2.setEdad(21);
		c2.setNombre("Marco");
		Cliente c3 = new Cliente();
		c3.setApellido("Mancheno");
		c3.setCedula("17554300093");
		c3.setEdad(34);
		c3.setNombre("José");
		Cliente c4 = new Cliente();
		c4.setApellido("Gabriela");
		c4.setCedula("17666533321");
		c4.setEdad(31);
		c4.setNombre("Gabriela");
		Cliente c5 = new Cliente();
		c5.setApellido("Gualotuña");
		c5.setCedula("1764407783");
		c5.setEdad(42);
		c5.setNombre("Mercedes");
		Cliente c6 = new Cliente();
		c6.setApellido("Toapanta");
		c6.setCedula("176654332111");
		c6.setEdad(46);
		c6.setNombre("Fernando");
		
		//--CREACIÓN DE LAS COLECCIONES DE VEHICULOS
		
		Set<Vehiculo> lv1 = new HashSet<>();
		lv1.add(v1);
		lv1.add(v5);
		lv1.add(v3);
		
		Set<Vehiculo> lv2 = new HashSet<>();
		lv2.add(v1);
		lv2.add(v2);
		lv2.add(v3);
		lv2.add(v6);
		
		Set<Vehiculo> lv3 = new HashSet<>();
		lv3.add(v4);
		lv3.add(v2);
		lv3.add(v6);
		
		Set<Vehiculo> lv4 = new HashSet<>();
		lv4.add(v1);
		lv4.add(v2);
		lv4.add(v3);
		lv4.add(v4);
		lv4.add(v5);
		lv4.add(v6);
		
		// --ASIGNACIÓN DE VEHIULOS PARA LOS CLIENTES
		
		c1.setVehiculos(lv4);
		c2.setVehiculos(lv1);
		c3.setVehiculos(lv3);
		c4.setVehiculos(lv2);
		c4.setVehiculos(lv4);
		c5.setVehiculos(lv3);
		c6.setVehiculos(lv1);
		
		
		//--CREACIÓN DE LAS COLECCIONES DE CLIENTES
		
		Set<Cliente> cl1= new HashSet<>();
		cl1.add(c6);
		cl1.add(c2);
		cl1.add(c1);
		cl1.add(c3);
		
		Set<Cliente> cl2= new HashSet<>();
		cl2.add(c1);
		cl2.add(c2);
		cl2.add(c5);
		cl2.add(c3);
		
		Set<Cliente> cl3= new HashSet<>();
		cl3.add(c5);
		cl3.add(c2);
		
		Set<Cliente> cl4= new HashSet<>();
		cl4.add(c5);
		cl4.add(c2);
		cl4.add(c3);
		cl4.add(c4);
		cl4.add(c1);
		
		// --ASIGNACIÓN DE CLIENTES DE VEHICULOS
		
		v1.setClientes(cl4);
		v2.setClientes(cl3);
		v3.setClientes(cl2);
		v4.setClientes(cl1);
		v5.setClientes(cl2);
		v6.setClientes(cl4);
		
		//INGRESAMOS LOS DATOS A LA BASE DE DATOS
		
		this.iVehiculoService.agregar(v6);
		this.iVehiculoService.agregar(v5);
		this.iVehiculoService.agregar(v4);
		this.iVehiculoService.agregar(v3);
		this.iVehiculoService.agregar(v2);
		this.iVehiculoService.agregar(v1);
		
		
		
	}

}
