package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Producto;

@Service
public class ProductoService implements IProductoService {

    public List<Producto> LIST_PRODUCTO;

    public ProductoService() {
        this.LIST_PRODUCTO = new ArrayList<>();
    }

    @Override
    public List<Producto> findAll() {
        return LIST_PRODUCTO;
    }

    @Override
    public void save(Producto producto) {
        LIST_PRODUCTO.add(producto);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < this.LIST_PRODUCTO.size(); i++) {
            if (this.LIST_PRODUCTO.get(i).getId() == id) {
                this.LIST_PRODUCTO.remove(i);
            }
            //this.LIST_PRODUCTO.remove(id);
        }
    }

    @Override
    public Producto getProducto(int id) {
        //return LIST_PRODUCTO.get(id);
        Producto producto = null;
        for (int i = 0; i < this.LIST_PRODUCTO.size(); i++) {
            if (this.LIST_PRODUCTO.get(i).getId() == id) {
                producto = this.LIST_PRODUCTO.get(i);
            }
            //this.LIST_PRODUCTO.remove(id);
        }
        return producto;
    }
}
