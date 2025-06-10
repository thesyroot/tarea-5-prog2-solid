package Controllers.Commands;

import Controllers.ModelControllers.GenericModelController;
import lombok.Getter;

@Getter
public abstract class GenericCommand {
    private final GenericModelController modelController;

    public GenericCommand(GenericModelController modelController) {
        this.modelController = modelController;
    }

    public abstract void execute();
}
