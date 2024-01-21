package com.vedruna.mancinacastroe01.model;

public class Product {


    private int productID;


    private String nombre;


    private float precio;

    public Product() {
    }

    public Product(int productID, String nombre, float precio) {
        this.productID = productID;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Id: "+getProductID()+"Name: "+"Price: "+getPrecio();
    }
}
