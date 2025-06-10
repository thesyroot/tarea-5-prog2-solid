package Controllers;

import Controllers.Commands.GenericCommand;
import Controllers.Commands.RegisterEntrada;
import Controllers.Commands.ShowDiffClients;
import Controllers.Commands.ShowDiffPass;
import Controllers.ModelControllers.ClientTypeController;
import Controllers.ModelControllers.GenericModelController;
import Controllers.ModelControllers.PassTypeController;
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

        this.clientController = new ClientTypeController(new ClientView());
        this.passController = new PassTypeController(new PassView());

        this.commands.put(1, new ShowDiffPass(this.passController));
        this.commands.put(2, new ShowDiffClients(this.clientController));
        this.commands.put(3, new RegisterEntrada(null));
    }
}
