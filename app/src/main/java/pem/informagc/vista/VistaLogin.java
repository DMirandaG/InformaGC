package pem.informagc.vista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import pem.informagc.R;

public class VistaLogin extends AppCompatActivity implements IVistaLogin {


    private TextView linkRegistro;
    private TextView linkRecuperarPassword;
    private Button botonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_vista_login);
        linkRegistro = (TextView) findViewById(R.id.linkRegistro);
        linkRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irARegistro();
            }
        });

        linkRecuperarPassword = (TextView) findViewById(R.id.linkRecuperarPassword);
        linkRecuperarPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irARecuperarPassword();
            }
        });

        botonLogin = (Button) findViewById(R.id.botonLogin);
        botonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarSesion();
            }
        });
    }

    @Override
    public void irARegistro() {
        Intent intent = new Intent(this, VistaRegistro.class);
        startActivity(intent);
    }

    @Override
    public void irARecuperarPassword() {
        Intent intent = new Intent(this, VistaRecuperarPassword.class);
        startActivity(intent);
    }

    @Override
    public void iniciarSesion() {
        Intent intent = new Intent(this, VistaPasoUno.class);
        startActivity(intent);
        finish();
    }


}
