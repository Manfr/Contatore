package com.example.manfredi.esercizio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityContatore extends AppCompatActivity {


    //view layout

    private TextView Messaggio;
    private Button Aumenta;
    private Button Diminuisci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contatore);

        //imposto i riferimenti delle view
        Messaggio = findViewById(R.id.textMessaggio);
        Aumenta = findViewById(R.id.buttonAumenta);
        Diminuisci = findViewById(R.id.buttonDiminuisci);

    }
}
