package pem.informagc.vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import pem.informagc.R;

public class VistaRecuperarPassword extends AppCompatActivity implements IVistaRecuperarPassword {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_vista_recuperar_password);
    }
}
