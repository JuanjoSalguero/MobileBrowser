package com.example.mobilebrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Almacena en la variable lo introducido a buscar
        editText = (EditText)findViewById(R.id.search);
    }

    // Método para pasar información a otra activity
    public void SendInformation(View view){
        // Pasar la información de un ativity a otra activity
        Intent intent = new Intent(this, MainActivity2.class);
        // Pasar el dato introducido a la otra activity
        intent.putExtra("writen", editText.getText().toString());

        // Realizar la acción que se recoge anteriormente
        startActivity(intent);
    }

}