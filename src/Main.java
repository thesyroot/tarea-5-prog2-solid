import Controllers.MenuController;
import Views.MenuView;

public class Main {
    public static void main(String[] args) {
        MenuController menuController = new MenuController(new MenuView());
        menuController.begin();
    }
}