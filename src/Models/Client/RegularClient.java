package Models.Client;

public class RegularClient extends Client {
    @Override
    public float getDisccount() {
        return 1f;
    }
}
