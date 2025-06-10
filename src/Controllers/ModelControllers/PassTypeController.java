package Controllers.ModelControllers;

import Models.Pass.FamiliarPass;
import Models.Pass.Pass;
import Models.Pass.RegularPass;
import Views.PassView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PassTypeController implements GenericModelController {
    private final Set<Pass> passTypes;
    private final PassView passView;

    public PassTypeController(PassView passView) {
        this.passView = passView;

        this.passTypes = new HashSet<Pass>();

        this.passTypes.add(new RegularPass());
        this.passTypes.add(new FamiliarPass());
    }

    @Override
    public void add() {

    }

    @Override
    public void show() {
        this.passView.showTypes(passTypes.stream()
                .collect(ArrayList::new, (l, pass) -> l.add(pass.getClass().getSimpleName()), ArrayList::addAll));
    }
}
