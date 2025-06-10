package Models;

import Models.Client.Client;
import Models.Pass.Pass;
import lombok.Data;

@Data
public class Entrada {
    private int precio;
    private String nombre;
    private Pass pase;
    private Client client;

    public Entrada() {}

    public Entrada(int precio, String nombre, Pass pase, Client client) {
        this.precio = precio;
        this.nombre = nombre;
        this.pase = pase;
        this.client = client;
    }
}
