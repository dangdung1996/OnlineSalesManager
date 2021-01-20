package model;

import java.io.Serializable;

public class Product implements Serializable {
    private String nameProduct;
    private String idProduct;
    private String colorProduct;
    private String size;
    private double price;

    public Product() {
    }
    public Product(String nameProduct, String idProduct, String colorProduct, String size,double price) {
        this.nameProduct = nameProduct;
        this.size = size;
        this.idProduct = idProduct;
        this.colorProduct = colorProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getColorProduct() {
        return colorProduct;
    }

    public void setColorProduct(String colorProduct) {
        this.colorProduct = colorProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", idProduct='" + idProduct + '\'' +
                ", colorProduct='" + colorProduct + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }


}
