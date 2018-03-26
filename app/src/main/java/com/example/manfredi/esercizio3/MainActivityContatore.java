package com.example.manfredi.esercizio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivityContatore extends AppCompatActivity {


    //view layout

    private TextView Messaggio;
    private Button Aumenta;
    private Button Diminuisci;
    private Button Azzera;
    private CheckBox Raddoppia;

    //creo contatore
    private int Contatore=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contatore);

        //imposto i riferimenti delle view
        Messaggio = findViewById(R.id.textMessaggio);
        Aumenta = findViewById(R.id.buttonAumenta);
        Diminuisci = findViewById(R.id.buttonDiminuisci);
        Azzera = findViewById(R.id.buttonAzzera);
        Raddoppia = findViewById(R.id.chkRaddoppia);

        //Imposto azione dei pulsanti
        Aumenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++Contatore;
                if (Raddoppia.isChecked()){++Contatore;}
                visualizzaMessaggio();
            }
        });

        Diminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --Contatore;
                if (Raddoppia.isChecked()){--Contatore;}
                visualizzaMessaggio();
            }
        });

        Azzera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Contatore=0;visualizzaMessaggio();
            }
        });

    }

    /**
     * Visualizza il valore del contatore
     */
    private void visualizzaMessaggio (){
        Messaggio.setText(getString(R.string.valore) + " " + Contatore);
    }
}
