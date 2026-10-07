package modul02.problem1;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Fruit apple = new Fruit("Apel", 7000, 0.4f, 40);
        Fruit mango = new Fruit("Mangga", 3500, 0.2f, 15);
        Fruit avocado = new Fruit("Alpukat", 10000, 0.25f, 12);

        apple.printInfo();
        mango.printInfo();
        avocado.printInfo();

    }
}