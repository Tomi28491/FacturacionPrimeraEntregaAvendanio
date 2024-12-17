package com.coderhouse.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idProducto;
	private String nombre;
	
	@Column(nullable=false)
	private int cantidad;
	
	@ManyToMany(mappedBy = "productos", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Venta> ventas = new ArrayList<>();
	private double precio;
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Producto(String nombre, int cantidad, double precio) {
		this();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}



	public List<Venta> getVentas() {
		return ventas;
	}


	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}


	public long getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", ventas="
				+ ventas + ", precio=" + precio + "]";
	}


	
	
	
	

}
