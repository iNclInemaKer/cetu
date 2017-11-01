package com.example.teamo.cetu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUusario, etClave;
    Button btnIniciar, btnRegistarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        etUusario=(EditText)findViewById(R.id.etUsuario);
        etClave=(EditText)findViewById(R.id.etClave);
        btnIniciar=(Button)findViewById(R.id.btnIniciar);
        btnRegistarse=(Button)findViewById(R.id.btnRegistrarse);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Bienvenido",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
