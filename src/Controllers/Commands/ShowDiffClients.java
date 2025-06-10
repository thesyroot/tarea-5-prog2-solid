package Controllers.Commands;

import Controllers.ModelControllers.GenericModelController;

public class ShowDiffClients extends  GenericCommand{
    public ShowDiffClients(GenericModelController modelController) {
        super(modelController, "Mostrar diferentes clientes");
    }

    @Override
    public void execute() {
        super.getModelController().show();
    }
}
