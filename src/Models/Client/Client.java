package Models.Client;

import Models.Interface.DisccountInterface;

public abstract class Client implements DisccountInterface {
    private String nombre;
    private long nro;

    public abstract float getDisccount();
}
