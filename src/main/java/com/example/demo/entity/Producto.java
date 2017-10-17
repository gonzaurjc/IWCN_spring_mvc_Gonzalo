package com.example.demo.entity;

import javax.validation.constraints.Size;

public class Producto {

    public int id;
    @Size(min = 4, max = 45, message = "el nombre debe tener minimo 4 letras y maximo 45")
    public String nombre;
    @Size(min = 4, max = 45, message = "la descripcion debe tener minimo 4 letras y maximo 45")
    public String descripcion;
    public Long precio;

    public Producto() {
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

}
