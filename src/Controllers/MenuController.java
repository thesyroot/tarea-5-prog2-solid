package Controllers;

import Views.MenuView;

public class MenuController {
    private CoreController coreController;
    private MenuView menuView;

    public MenuController(MenuView menuView) {
        this.menuView = menuView;

        this.coreController = new CoreController();
    }
}
