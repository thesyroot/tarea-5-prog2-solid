package Views.Asker;

import java.util.Scanner;

public class GenericAsker {
    private final Scanner sc;

    public GenericAsker() {
        this.sc = new Scanner(System.in);
    }

    public int askInt(String element){
        System.out.print("Ingrese el "+element+":");
        return this.sc.nextInt();
    }

    public String askString(String element){
        System.out.print("Ingrese el "+element+":");
        return this.sc.next();
    }

    public long askLong(String element){
        System.out.print("Ingrese el "+element+":");
        return this.sc.nextLong();
    }
}
