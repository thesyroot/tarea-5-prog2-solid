package Controllers.ModelControllers;

import Models.Client.Client;
import Models.Client.LocalClient;
import Models.Client.RegularClient;
import Views.ClientView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ClientTypeController implements GenericModelController {
    private final Set<Client> clientTypes;
    private final ClientView clientView;

    public ClientTypeController(ClientView clientView) {
        this.clientView = clientView;

        this.clientTypes = new HashSet<Client>();

        this.clientTypes.add(new LocalClient());
        this.clientTypes.add(new RegularClient());
    }

    @Override
    public void add() {

    }

    @Override
    public void show() {
        this.clientView.showTypes(clientTypes.stream()
                .collect(ArrayList::new, (l, cli) -> l.add(cli.getClass().getSimpleName()), ArrayList::addAll));
    }
}
