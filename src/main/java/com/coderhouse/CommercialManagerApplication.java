package com.coderhouse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.DaoFactory;
import com.coderhouse.entity.Cliente;
import com.coderhouse.entity.Producto;
import com.coderhouse.entity.Venta;


@SpringBootApplication
public class CommercialManagerApplication implements CommandLineRunner{
	
	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(CommercialManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			Cliente cliente1 = new Cliente("Tomas", "Avendaño","tavendanio@gmail.com" , 44828991, "Cordoba, Argentina");
			Cliente cliente2 = new Cliente("Julieta", "Rodriguez","jrodriguez@gmail.com" , 44828980, "Formosa, Argentina");
			
			Producto producto1 = new Producto("Bicicleta", 10, 350000d);
			Producto producto2 = new Producto("Notebook", 8, 500000d);
			Producto producto3 = new Producto("PlayStation 5", 3, 1500000d);
			Producto producto4 = new Producto("Auto", 2 , 20000000d);
			Producto producto5 = new Producto("TV", 4, 400000d);
			
			

	
			dao.persistirCliente(cliente1);
			dao.persistirCliente(cliente2);
			
			dao.persistirProducto(producto1);
			dao.persistirProducto(producto2);
			dao.persistirProducto(producto3);
			dao.persistirProducto(producto4);
			dao.persistirProducto(producto5);
			

			
		}catch (Exception e) {
			e.printStackTrace(System.err);
		}
		
	}

}
