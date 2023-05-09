package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    private static final String FILE_PATH = "Products.csv";
    public static void main(String[] args) throws IOException {

        Product product = new Product(27, "Макароны", "Макароны", 50, 122, "piece");
        Service.writeData(FILE_PATH, product);

        List<Product> products = Service.readData(FILE_PATH);
        products.forEach(System.out::println);
    }


}