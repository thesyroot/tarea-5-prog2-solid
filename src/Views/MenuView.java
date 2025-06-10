package Views;

import Controllers.Commands.GenericCommand;
import Views.Asker.GenericAsker;
import Views.Shower.GenericShower;

import java.util.HashMap;
import java.util.Map;

public class MenuView {
    private final GenericAsker menuAsker;
    private final GenericShower menuShower;

    public MenuView() {
        this.menuShower = new GenericShower();
        this.menuAsker = new GenericAsker();
    }

    public void showMenu(HashMap<Integer, GenericCommand> commands){
        this.menuShower.show("-------------------------------------------");
        commands.forEach((pos, cmd) -> this.menuShower.show(pos+". "+cmd.getOption()+"."));
        this.menuShower.show("-------------------------------------------");
    }

    public int nextOption(){
        return this.menuAsker.askInt("numero");
    }
}
