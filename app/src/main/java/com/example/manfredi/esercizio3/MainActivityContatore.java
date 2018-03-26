package com.example.manfredi.esercizio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityContatore extends AppCompatActivity {


    //view layout

    private TextView Messaggio;
    private Button Aumenta;
    private Button Diminuisci;

    //creo contatore
    private int Contatore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contatore);

        //imposto i riferimenti delle view
        Messaggio = findViewById(R.id.textMessaggio);
        Aumenta = findViewById(R.id.buttonAumenta);
        Diminuisci = findViewById(R.id.buttonDiminuisci);

        //Imposto azione dei pulsanti
        Aumenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++Contatore; visualizzaMessaggio();
            }
        });

        Diminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --Contatore;visualizzaMessaggio();
            }
        });

    }

    /**
     * Visualizza il valore del contatore
     */
    private void visualizzaMessaggio (){
        Messaggio.setText(getString(R.string.valore) + Contatore);
    }
}
