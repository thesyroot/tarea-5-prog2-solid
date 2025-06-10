package Views;

import Models.Client.Client;
import Views.Asker.GenericAsker;
import Views.Shower.GenericShower;

import java.util.List;

public class ClientView {
    private final GenericAsker clientAsker;
    private final GenericShower clientShower;

    public ClientView() {
        this.clientAsker = new GenericAsker();
        this.clientShower = new GenericShower();
    }

    public void showTypes(List<String> lista){
        this.clientShower.showFromList(lista);
    }
}
