package Models;

import java.lang.ref.Cleaner;

public class LocalClient extends Client {
    @Override
    public float getDisccount() {
        return 0.85f;
    }
}
