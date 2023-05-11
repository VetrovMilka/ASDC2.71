package org.example;



/**

 The Product class represents a product in a store.
 */
public class Product {
    private Integer id; // The ID of the product.
    private String name; // The name of the product.
    private String description; // The description of the product.
    private Integer price; // The price of the product.
    private Integer pieces; // The number of pieces of the product.
    private String unitOfMeasurement; // The unit of measurement of the product.

    /**

     Constructs a new Product with the given parameters.
     @param id the ID of the product
     @param name the name of the product
     @param description the description of the product
     @param price the price of the product
     @param pieces the number of pieces of the product
     @param unitOfMeasurement the unit of measurement of the product
     */
    public Product(Integer id, String name, String description, Integer price, Integer pieces, String unitOfMeasurement) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.pieces = pieces;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    /**

     Constructs a new Product by copying an existing one.
     @param product the product to copy
     */
    public Product(Product product) {
        this.id = product.id;
        this.name = product.name;
        this.description = product.description;
        this.price = product.price;
        this.pieces = product.pieces;
        this.unitOfMeasurement = product.unitOfMeasurement;
    }

    /**

     Building a new Product with the given parameters.
     @param id the ID of the product
     @param name the name of the product
     @param description the description of the product
     @param price the price of the product
     @param pieces the number of pieces of the product
     @param unitOfMeasurement the unit of measurement of the product
     @return a new Product with the given parameters
     */
    public static Product create(Integer id, String name, String description, Integer price, Integer pieces, String unitOfMeasurement) {
        return new Product(id, name, description, price, pieces, unitOfMeasurement);
    }

    /**

     Creates a copy of this Product.
     @return a copy of this Product
     */
    public Product copy() {
        return new Product(this);
    }

    /**

     @return the ID of the product
     */
    public Integer getId() {
        return id;
    }

    /**

     @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**

     @return the description of the product
     */
    public String getDescription() {
        return description;
    }

    /**

     @return the price of the product
     */
    public Integer getPrice() {
        return price;
    }

    /**

     @return the number of pieces of the product
     */
    public Integer getPieces() {
        return pieces;
    }

    /**

     @return the unit of measurement of the product
     */
    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    /**
     *
     @return a boolean value representing if this object is equal to @param object.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;

        if (!getId().equals(product.getId())) return false;
        if (getName() != null ? !getName().equals(product.getName()) : product.getName() != null) return false;
        if (getDescription() != null ? !getDescription().equals(product.getDescription()) : product.getDescription() != null)
            return false;
        if (getPrice() != null ? !getPrice().equals(product.getPrice()) : product.getPrice() != null) return false;
        if (getPieces() != null ? !getPieces().equals(product.getPieces()) : product.getPieces() != null) return false;
        return getUnitOfMeasurement() != null ? getUnitOfMeasurement().equals(product.getUnitOfMeasurement()) : product.getUnitOfMeasurement() == null;
    }

    /**

     Returns a hash code value for the product object by computing a hash of its fields.
     @return an integer value representing the hash code of the product object.
     */
    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getPieces() != null ? getPieces().hashCode() : 0);
        result = 31 * result + (getUnitOfMeasurement() != null ? getUnitOfMeasurement().hashCode() : 0);
        return result;
    }

    /**

     Returns a string representation of the product object in the following format:
     id;name;description;price;pieces;unitOfMeasurement
     @return a string representation of the product object.
     */
    @Override
    public String toString() {
        return
                id +
                ";" + name +
                ";" + description +
                ";" + price +
                ";" + pieces +
                ";" + unitOfMeasurement;
    }
}
