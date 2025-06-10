package Views;

import Views.Asker.GenericAsker;
import Views.Shower.GenericShower;

import java.util.List;

public class PassView {
    private final GenericAsker passAsker;
    private final GenericShower passShower;

    public PassView() {
        this.passAsker = new GenericAsker();
        this.passShower = new GenericShower();
    }

    public void showTypes(List<String> lista){
        this.passShower.showFromList(lista);
    }
}
