package Controllers.Commands;

import Controllers.ModelControllers.GenericModelController;

public class RegisterEntrada extends GenericCommand{
    public RegisterEntrada(GenericModelController modelController) {
        super(modelController, "Registrar una entrada");
    }

    @Override
    public void execute() {
        super.getModelController().add();
    }
}
