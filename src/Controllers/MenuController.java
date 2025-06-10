package Controllers;

import Controllers.Commands.GenericCommand;
import Views.MenuView;

public class MenuController {
    private CoreController coreController;
    private MenuView menuView;

    public MenuController(MenuView menuView) {
        this.menuView = menuView;

        this.coreController = new CoreController();
    }

    public void begin() {
        int option = -1;
        while(option != 0){
            this.menuView.showMenu(this.coreController.getCommands());
            option = this.menuView.nextOption();

            this.coreController.getCommands().getOrDefault(option,
                    new GenericCommand(null, "Salir") {
                        @Override
                        public void execute() {
                            System.exit(0);
                        }
                    }).execute();
        }
    }
}
