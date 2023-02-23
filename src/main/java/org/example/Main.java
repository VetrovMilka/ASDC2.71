package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Product product = new Product(27, "Макароны", "Макароны", 50, 122, "piece");
        Service.writeData("Products.csv", product);
        List<Product> products = Service.readData("Products.csv");
        products.forEach(System.out::println);
    }


}