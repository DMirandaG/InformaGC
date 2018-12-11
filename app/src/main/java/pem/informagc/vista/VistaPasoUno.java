package pem.informagc.vista;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import pem.informagc.AppMediador;
import pem.informagc.R;

public class VistaPasoUno extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, IVistaPasoUno {


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
    private AppMediador appMediador;
    private DrawerLayout drawer;



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


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }


    @Override
    public void irAPasoDos() {
        Intent intent = new Intent(this, VistaPasoDos.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed(){
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        } else{
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.nav_perfil) {
            Toast.makeText(this,"Perfil",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.nav_mis_informes) {
            Toast.makeText(this,"Mis Informes",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.nav_como_funciona) {
            Toast.makeText(this,"Como Funciona",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.nav_enviar_sugerencias) {
            Toast.makeText(this,"Enviar Sugerencias",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.nav_terminos) {
            Toast.makeText(this,"Terminos y Condiciones",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.nav_cerrar_sesion) {
            Toast.makeText(this,"Cerrar Sesion",Toast.LENGTH_SHORT).show();
        }
        drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
