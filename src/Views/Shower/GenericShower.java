package Views.Shower;

import java.util.List;

public class GenericShower {
    public <T> void show(T o){
        System.out.println(o);
    }

    public <T> void showFromList(List<T> list){
        for(T o : list) System.out.println(o);
    }
}
