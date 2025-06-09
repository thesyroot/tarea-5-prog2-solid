package Views;

import Views.Asker.GenericAsker;
import Views.Shower.GenericShower;

public class MenuView {
    private final GenericAsker menuAsker;
    private final GenericShower menuShower;

    public MenuView() {
        this.menuShower = new GenericShower();
        this.menuAsker = new GenericAsker();
    }

    public void showMenu(){
        this.menuShower.show("-------------------------------------------\n" +
                "1. Listar los diferentes pases para elegir.\n" +
                "-------------------------------------------\n");
    }

    public int nextOption(){
        return this.menuAsker.askInt("numero");
    }
}
