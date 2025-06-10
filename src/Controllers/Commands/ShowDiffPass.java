package Controllers.Commands;

import Controllers.ModelControllers.GenericModelController;

public class ShowDiffPass extends GenericCommand{
    public ShowDiffPass(GenericModelController modelController) {
        super(modelController);
    }

    @Override
    public void execute() {
        super.getModelController().showListOfTypes();
    }
}
