package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.entity.Cliente;
import com.coderhouse.entity.Producto;
import com.coderhouse.entity.Venta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class DaoFactory {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void persistirCliente(Cliente clie) {
		em.persist(clie);
	}
	
	@Transactional
	public void persistirProducto(Producto prod) {
		em.persist(prod);
	}
	
	@Transactional
	public void persistirVenta(Venta ven) {
		em.persist(ven);
	}
}
