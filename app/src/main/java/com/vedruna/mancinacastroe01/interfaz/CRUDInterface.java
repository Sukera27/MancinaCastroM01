package com.vedruna.mancinacastroe01.interfaz;

import com.vedruna.mancinacastroe01.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CRUDInterface {

    @GET("productos")
    Call<List<Product>>getAll();
}
