package Controllers.Commands;

import Controllers.ModelControllers.GenericModelController;

public class ShowDiffPass extends GenericCommand{
    public ShowDiffPass(GenericModelController modelController) {
        super(modelController, "Mostrar diferentes pases");
    }

    @Override
    public void execute() {
        super.getModelController().show();
    }
}
