package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Service {

    public static String SEPARATOR = ";";
    public static Product read(String data) {
        try {
            String[] tokens = data.split(Service.SEPARATOR);
            return Product.create(
                    Integer.parseInt(tokens[0]),
                    tokens[1],
                    tokens[2],
                    Integer.parseInt(tokens[3]),
                    Integer.parseInt(tokens[4]),
                    tokens[5]
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Product> readData(BufferedReader reader) {
        String data;
        List<Product> result = new ArrayList<>();
        try {
            while((data = reader.readLine()) != null) {
                Product product = Service.read(data);
                result.add(product);
            }

        } catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

}
