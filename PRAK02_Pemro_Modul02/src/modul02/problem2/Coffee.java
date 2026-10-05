package modul02.problem2;

import java.util.Locale;

public class Coffee {
    private String coffeeName;
    private String size;
    private float price;
    private String customers;

    public void printInfo() {
        Locale.setDefault(Locale.US);
        System.out.println("Nama Kopi: " + coffeeName);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: Rp. " + price);
    }

    public void setName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCustomer(String customers) {
        this.customers = customers;
    }

    public String getCustomer() {
        return customers;
    }

    public float getTax() {
        return price * 0.11f ;
    }
}