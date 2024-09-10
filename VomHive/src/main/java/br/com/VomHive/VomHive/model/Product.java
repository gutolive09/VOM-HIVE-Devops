package br.com.VomHive.VomHive.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TBL_PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    private String target;

    private String nmProduct;

    private String differential;

    private double price;

    private String salesChannel;

    public Product() {
    }

    public Product(Long idProduct, String target, String nmProduct, String differential, double price, String salesChannel) {
        this.idProduct = idProduct;
        this.target = target;
        this.nmProduct = nmProduct;
        this.differential = differential;
        this.price = price;
        this.salesChannel = salesChannel;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getNmProduct() {
        return nmProduct;
    }

    public void setNmProduct(String nmProduct) {
        this.nmProduct = nmProduct;
    }

    public String getDifferential() {
        return differential;
    }

    public void setDifferential(String differential) {
        this.differential = differential;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSalesChannel() {
        return salesChannel;
    }

    public void setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
    }
}
