package pem.informagc.vista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import pem.informagc.R;

public class VistaPasoUno extends AppCompatActivity implements IVistaPasoUno {


    private CardView cardAceras;
    private CardView cardJardines;
    private CardView cardBancos;
    private CardView cardBarandillas;
    private CardView cardFarolas;
    private CardView cardPapeleras;
    private CardView cardPivotes;
    private CardView cardPlayas;
    private CardView cardSemaforos;
    private CardView cardParques;
    private CardView cardSaneamiento;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_paso_uno);

        cardAceras = (CardView) findViewById(R.id.cardAceras);
        cardAceras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAPasoDos();
            }
        });
        cardJardines = (CardView) findViewById(R.id.cardJardines);
        cardJardines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAPasoDos();
            }
        });
        cardBancos = (CardView) findViewById(R.id.cardBancos);
        cardBancos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAPasoDos();
            }
        });
        cardBarandillas = (CardView) findViewById(R.id.cardBarandillas);
        cardBarandillas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAPasoDos();
            }
        });
        cardFarolas = (CardView) findViewById(R.id.cardFarolas);
        cardFarolas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAPasoDos();
            }
        });
        cardPapeleras = (CardView) findViewById(R.id.cardPapeleras);
        cardPapeleras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAPasoDos();
            }
        });
        cardPivotes = (CardView) findViewById(R.id.cardPivotes);
        cardPivotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAPasoDos();
            }
        });
        cardPlayas = (CardView) findViewById(R.id.cardPlayas);
        cardPlayas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAPasoDos();
            }
        });
        cardSemaforos = (CardView) findViewById(R.id.cardSemaforos);
        cardSemaforos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAPasoDos();
            }
        });
        cardParques = (CardView) findViewById(R.id.cardParques);
        cardParques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAPasoDos();
            }
        });
        cardSaneamiento = (CardView) findViewById(R.id.cardSaneamiento);
        cardSaneamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAPasoDos();
            }
        });
    }


    @Override
    public void irAPasoDos() {
        Intent intent = new Intent(this, VistaPasoDos.class);
        startActivity(intent);
    }
}
