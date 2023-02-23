package org.example;

public class Product {
    private Integer id;
    private String name;
    private String description;
    private Integer price;
    private Integer pieces;
    private String unitOfMeasurement;

    public Product() {
    }

    public Product(Integer id, String name,
                   String description, Integer price,
                   Integer pieces, String unitOfMeasurement) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.pieces = pieces;
        this.unitOfMeasurement = unitOfMeasurement;
    }
    public Product(Product product) {
        this.id = product.id;
        this.name = product.name;
        this.description = product.description;
        this.price = product.price;
        this.pieces = product.pieces;
        this.unitOfMeasurement = product.unitOfMeasurement;
    }

    public static Product create(Integer id, String name,
                                 String description, Integer price,
                                 Integer pieces, String unitOfMeasurement){
        return new Product(id, name, description, price, pieces, unitOfMeasurement);
    }

    public Product copy(){
        return new Product(this);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getPieces() {
        return pieces;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", pieces=" + pieces +
                ", unitOfMeasurement='" + unitOfMeasurement + '\'' +
                '}';
    }
}
