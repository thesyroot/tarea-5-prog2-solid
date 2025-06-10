package Controllers;

import Controllers.Commands.GenericCommand;
import Controllers.Commands.ShowDiffClients;
import Controllers.Commands.ShowDiffPass;
import Controllers.ModelControllers.ClientController;
import Controllers.ModelControllers.GenericModelController;
import Controllers.ModelControllers.PassController;
import Views.ClientView;
import Views.PassView;
import lombok.Getter;

import java.util.HashMap;

@Getter
public class CoreController {
    private final HashMap<Integer, GenericCommand> commands;
    private final GenericModelController clientController;
    private final GenericModelController passController;

    public CoreController() {
        this.commands = new HashMap<>();

        this.clientController = new ClientController(new ClientView());
        this.passController = new PassController(new PassView());

        this.commands.put(1, new ShowDiffPass(this.passController));
        this.commands.put(2, new ShowDiffClients(this.clientController));
    }
}
