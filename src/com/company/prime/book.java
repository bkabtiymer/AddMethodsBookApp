package com.company.prime;

public class book {

    private String title;
    private String author;
    private String description;
    private double price;
    private String Stock;


    public book() {
    }

//    public String displayText(){
//        return getTitle()+" "+getBookAuthor()+" "+getDescription()+" "+getPrice()+" "+getStock();

    public book(String title2, String author2, String des2, double price2, String stock2) {
        title = title2;
        author = author2;
        description = des2;
        price = price2;
        this.Stock = stock2;
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

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        this.Stock = stock;
    }





public String getDisplayText(){
        return title+author+description;

}


}

