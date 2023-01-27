package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Pedido;
import com.example.demo.uce.repository.IClienteRepo;

@SpringBootApplication
public class ProyectoPaU2JoApplication implements CommandLineRunner {


	@Autowired
	private IClienteRepo clienteRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2JoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	 
	  Cliente cliente = new Cliente();
	  cliente.setApellido("Taco");
	  cliente.setCedula("175440232");
	  cliente.setEdad(21);
	  cliente.setNombre("Gabriela");
	  
	  Cliente cliente1 = new Cliente();
	  cliente1.setApellido("Chanataxi");
	  cliente1.setCedula("1754400099");
	  cliente1.setEdad(23);
	  cliente1.setNombre("Francisco");
	  
	  Pedido pedido1 = new Pedido();
	  pedido1.setCliente(cliente);
	  pedido1.setCodigo("WAssa23G3");
	  pedido1.setDescripcion("compra por EBAY (Bici)");
	  pedido1.setFecha(LocalDateTime.now());
	
	  Pedido pedido2 = new Pedido();
	  pedido2.setCliente(cliente);
	  pedido2.setCodigo("ZZXW232");
	  pedido2.setDescripcion("Celular reparacion");
	  pedido2.setFecha(LocalDateTime.now());
	  
	  Pedido pedido3 = new Pedido();
	  pedido3.setCliente(cliente1);
	  pedido3.setCodigo("TDFSSG3");
	  pedido3.setDescripcion("caja sorpresa");
	  pedido3.setFecha(LocalDateTime.now());
	  
	  Pedido pedido4 = new Pedido();
	  pedido4.setCliente(cliente1);
	  pedido4.setCodigo("WAdadasd");
	  pedido4.setDescripcion(" compra de peliculas ");
	  pedido4.setFecha(LocalDateTime.now());
	  
	  List<Pedido>c1 = new ArrayList<>();
	  c1.add(pedido1);
	  c1.add(pedido2);
	  
	  List<Pedido>c2 = new ArrayList<>();
	  c2.add(pedido4);
	  c2.add(pedido3);
	  
	  cliente.setPedido(c1);
	  cliente1.setPedido(c2);
	  
	  this.clienteRepo.insertar(cliente1);
	  this.clienteRepo.insertar(cliente);
	  
	  Cliente clienteN = this.clienteRepo.buscar(3);
	  
	  clienteN.setEdad(33);
	  clienteN.setApellido("Mancheno");
	  
	  this.clienteRepo.actualizar(clienteN);
	  
	  this.clienteRepo.eliminar(7);
	  this.clienteRepo.eliminar(5);
	  this.clienteRepo.eliminar(8);
	
	
	
	}

}
