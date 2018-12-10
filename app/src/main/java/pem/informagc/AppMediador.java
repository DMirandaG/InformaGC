package pem.informagc;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;

public class AppMediador extends Application {
    private static AppMediador singleton;

    public static AppMediador getInstance(){
        return singleton;
    }


    // TODO: 08/12/2018 revisar, no dejar así, solo de ejemplo
    // constantes de comunicación, almacenamiento y petición
    public static final int ESTADO_INICIAL = 0;
    public static final int ESTADO_AGREGAR_MARCA = 1;
    public static final int ESTADO_BORRAR_MARCA = 2;
    public static final String CLAVE_LATITUD = "latitud";
    public static final String CLAVE_LONGITUD = "longitud";
    public static final String CLAVE_TITULO = "titulo";
    public static final String CLAVE_MARCAS = "marcas";

    public static final String AVISO_ESTADO_INICIAL = "pem.tema4.AVISO_ESTADO_INICIAL";
    public static final String AVISO_LOCALIZACION_GPS = "pem.tema4.AVISO_LOCALIZACION_GPS";
    public static final String AVISO_AGREGAR_MARCA = "pem.tema4.AVISO_AGREGAR_MARCA";
    public static final String AVISO_BORRAR_MARCA = "pem.tema4.AVISO_BORRAR_MARCA";

    // Métodos de manejo de los componentes de Android
    public void launchActivity(Class actividadInvocada, Object invocador, Bundle extras) {
        Intent i = new Intent(this, actividadInvocada);
        if (extras != null)
            i.putExtras(extras);
        if (!invocador.getClass().equals(Activity.class))
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
    }

    public void launchActivityForResult(Class actividadInvocada,
                                        Activity actividadInvocadora, int requestCode, Bundle extras) {
        Intent i = new Intent(actividadInvocadora, actividadInvocada);
        if (extras != null)
            i.putExtras(extras);
        actividadInvocadora.startActivityForResult(i, requestCode);
    }

    public void launchService(Class servicioInvocado, Bundle extras) {
        Intent i = new Intent(this, servicioInvocado);
        if (extras != null)
            i.putExtras(extras);
        startService(i);
    }

    public void stopService(Class servicioInvocado) {
        Intent i = new Intent(this, servicioInvocado);
        stopService(i);
    }

    public void registerReceiver(BroadcastReceiver receptor, String accion) {
        LocalBroadcastManager.getInstance(this).registerReceiver(receptor, new IntentFilter(accion));
    }

    public void unRegisterReceiver(BroadcastReceiver receptor) {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(receptor);
    }

    public void sendBroadcast(String accion, Bundle extras) {
        Intent intent = new Intent();
        intent.setAction(accion);
        if (extras != null)
            intent.putExtras(extras);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
    }

}
