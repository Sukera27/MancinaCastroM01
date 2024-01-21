package com.vedruna.mancinacastroe01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CountFragment extends Fragment {


    public CountFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_count, container, false);

        // Obtener el nombre de usuario desde la actividad
        String username = getActivity().getIntent().getStringExtra("usuario");

        // Encontrar el TextView en el layout del fragment
        TextView tvUsername = view.findViewById(R.id.textView3);

        // Establecer el texto en el TextView
        tvUsername.setText("By " + username);



        return view;
    }
}