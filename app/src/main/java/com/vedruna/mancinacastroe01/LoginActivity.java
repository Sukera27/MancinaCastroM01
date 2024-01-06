package com.vedruna.mancinacastroe01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;




public class LoginActivity extends AppCompatActivity {
    private TextView usuario;
    private EditText contraseña;

    private TextView respuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
        usuario=findViewById(R.id.editTextText);
        contraseña=findViewById(R.id.editTextTextPassword);
        respuesta=findViewById(R.id.textView5);

    }
    public void login(View view){
        String user = usuario.getText().toString();
        String password = contraseña.getText().toString();
        if(user.equals("admin") && password.equals("admin")){

         respuesta.setText("Usuario y contraseña correcta");
            Intent intent=new Intent(this,MainActivity.class);
            intent.putExtra("usuario",user);
            startActivity(intent);
        }else {
            respuesta.setText("Usuario o contraseña incorrecta");
        }




    }

}
