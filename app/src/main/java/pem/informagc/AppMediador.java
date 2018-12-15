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


    // constantes de comunicación, almacenamiento y petición
    public static final int ESTADO_INICIAL = 0;
    public static final String CLAVE_INFORME_LISTO = "informe";

    public static final String AVISO_INFORME_LISTO = "pem.informagc.AVISO_INFORME_LISTO";

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
