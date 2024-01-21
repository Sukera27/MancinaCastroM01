package com.vedruna.mancinacastroe01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vedruna.mancinacastroe01.interfaz.CRUDInterface;
import com.vedruna.mancinacastroe01.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class APIFragment extends Fragment {


    List<Product> productList;
    CRUDInterface crudInterface;
    public APIFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gelAll();
    }
    private void gelAll(){
        Retrofit retrofit=new Retrofit.Builder().baseUrl("http://192.168.217.1:8080/").
                addConverterFactory(GsonConverterFactory.create()).build();
        crudInterface=retrofit.create(CRUDInterface.class);
        Call<List<Product>> call=crudInterface.getAll();
        call.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if(!response.isSuccessful()){
                    Log.e("Response err ",response.message());
                    return;
                }
                productList=response.body();
                productList.forEach(p-> Log.i("Productos: ",p.toString()));
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Log.e("Throw err:",t.getMessage());
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_api, container, false);
    }
}