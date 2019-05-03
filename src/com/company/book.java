package com.company;

import java.util.Scanner;

public class book {

    private String title;
    private String author;
    private String description;

    private double price;
    private boolean Stock = false;
    private int quantity;

    public book() {

    }

    public book(String author, String title, String descrip, double price) {

        this.author = author;

        this.title = title;

        this.description = descrip;

        this.price = price;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double bookPrice) {
        this.price = bookPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int title) {
        this.quantity = quantity;
    }

    public boolean getStock() {
        return Stock;
    }

    public double quantityPrice() {
        return price * quantity;
    }

    public void setStock(boolean inStock) {
        Stock = inStock;

        if (inStock == true) {
            System.out.println("In Stock! ");
        } else {
            System.out.println("Out of Stock " + getDisplayText());
        }
    }


    public String getDisplayText() {
        return title + author + description;

    }


}


