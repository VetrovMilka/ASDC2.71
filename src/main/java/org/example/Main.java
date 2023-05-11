package org.example;

import java.io.IOException;
import java.util.List;

/**

 This is the main class for the application that demonstrates reading and writing data to a CSV file using the
 Service class.
 The constant FILE_PATH stores the path to the file that will be read from and written to.
 */
public class Main {
    private static final String FILE_PATH = "Products.csv";

    /**

     The main method of the application. It creates a new product object and uses the Service class to write it to
     the CSV file. Then it reads all the products from the file using the same Service class and prints them to
     the console.

     @param args the command line arguments passed to the application
     @throws IOException if an I/O error occurs while reading or writing the file
     */
    public static void main(String[] args) throws IOException {
        Product product = new Product(27, "Макароны", "Макароны", 50, 122, "piece");
        Service.writeData(FILE_PATH, product);

        List<Product> products = Service.readData(FILE_PATH);
        products.forEach(System.out::println);
    }
}