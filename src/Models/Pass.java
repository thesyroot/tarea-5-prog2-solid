package Models;

import Models.Interface.DisccountInterface;

public abstract class Pass implements DisccountInterface {
    private int precio;

    public Pass() {}

    public abstract float getDisccount();
}
