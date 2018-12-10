package pem.informagc.modelo;

import pem.informagc.AppMediador;

public class Modelo implements IModelo {

    private static Modelo singleton = null;
    private AppMediador appMediador;

    private Modelo() {
        appMediador = AppMediador.getInstance();
    }

    public static Modelo getInstance() {
        if (singleton == null)
            singleton = new Modelo();
        return singleton;
    }
}
