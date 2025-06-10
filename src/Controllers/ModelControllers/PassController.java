package Controllers.ModelControllers;

import Models.Client.Client;
import Models.Client.LocalClient;
import Models.Client.RegularClient;
import Models.Pass.FamiliarPass;
import Models.Pass.Pass;
import Models.Pass.RegularPass;
import Views.ClientView;
import Views.PassView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PassController implements GenericModelController {
    private final Set<Pass> passTypes;
    private final PassView passView;

    public PassController(PassView passView) {
        this.passView = passView;

        this.passTypes = new HashSet<Pass>();

        this.passTypes.add(new RegularPass());
        this.passTypes.add(new FamiliarPass());
    }

    @Override
    public void showListOfTypes() {
        this.passView.showTypes(passTypes.stream()
                .collect(ArrayList::new, (l, pass) -> l.add(pass.getClass().getSimpleName()), ArrayList::addAll));
    }
}
