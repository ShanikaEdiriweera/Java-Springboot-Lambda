package com.sysco.lambdatest.entities;


import java.util.Objects;

public class Item {
    private Integer id;
    private String name;
    private String category;
    private String vendor;
    private Integer stock;

    public Item(Integer id, String name, String category, String vendor, Integer stock) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.vendor = vendor;
        this.stock = stock;
    }

    public Item(String name, String category, String vendor, Integer stock) {
        this.name = name;
        this.category = category;
        this.vendor = vendor;
        this.stock = stock;
    }

    public Item() {
    }

    public Item(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return getId() == item.getId() &&
                getStock() == item.getStock() &&
                Objects.equals(getName(), item.getName()) &&
                Objects.equals(getCategory(), item.getCategory()) &&
                Objects.equals(getVendor(), item.getVendor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getCategory(), getVendor(), getStock());
    }
}
