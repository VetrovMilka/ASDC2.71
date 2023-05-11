package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 A utility class for reading and writing Product data from the csv file using the ';' separator.
 */
public class Service {

    /**
     The separator used to split the data in the string from input file.
     */

    public static String SEPARATOR = ";";

    /**
     Reads a single Product object from a String containing its data separated by the Service.SEPARATOR.
     @param data a String containing the data for a single Product object
     @return a Product object parsed from the input data, or null if an error occurred during parsing
     */
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

    /**
     Reads a list of Strings and converting them into Product objects using read method,
     from the csv file containing their data separated by the Service.SEPARATOR.
     @param path the path to the input file
     @return a List of Product objects parsed from the input file
     @throws IOException if an error occurs while reading the input file
     */
    public static List<Product> readData(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path, StandardCharsets.UTF_8));
        String data;
        List<Product> result = new ArrayList<>();
        try {
            while((data = reader.readLine()) != null) {
                data = data.replaceAll("\\p{C}", "");
                Product product = Service.read(data);
                result.add(product);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    /**
     Appends the data for a single Product object to the scv file, using custom toString method.
     @param path the path to the output file
     @param product the Product object to write to the output file
     @throws IOException if an error occurs while writing to the output file
     */
    public static void writeData(String path, Product product) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        writer.append("\n").append(product.toString());
        writer.close();
    }
}