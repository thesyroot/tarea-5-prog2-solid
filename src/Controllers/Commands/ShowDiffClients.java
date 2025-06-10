package Controllers.Commands;

import Controllers.ModelControllers.GenericModelController;

public class ShowDiffClients extends  GenericCommand{
    public ShowDiffClients(GenericModelController modelController) {
        super(modelController);
    }

    @Override
    public void execute() {
        super.getModelController().showListOfTypes();
    }
}
