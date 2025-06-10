package Controllers.Commands;

import Controllers.ModelControllers.GenericModelController;
import lombok.Getter;

@Getter
public abstract class GenericCommand {
    private final GenericModelController modelController;
    private final String option;

    public GenericCommand(GenericModelController modelController, String option) {
        this.modelController = modelController;
        this.option = option;
    }

    public abstract void execute();
}
