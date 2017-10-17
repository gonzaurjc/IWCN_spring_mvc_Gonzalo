package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public void save(Producto producto);
        public void delete(int id);
        public Producto getProducto(int id);
}
