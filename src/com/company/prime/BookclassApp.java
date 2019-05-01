package com.company.prime;




public class BookclassApp {

    public static void main(String[] args) {

//        Create an object of the book class
        book mesaf=new book();

        System.out.println("Favorite Book Information: \n");
        mesaf.setTitle("Title: Lean in: Women Work and the Will to Lead \n");
        mesaf.setAuthor("Author: Sheryl Sandberg \n");
        mesaf.setDescription("Description: Biography\n");
        mesaf.setPrice(5.00);
        System.out.println("Price: "+ mesaf.getPrice());
        mesaf.setStock("Inventory: In stock");

        String bookInfo = mesaf.getDisplayText();
        System.out.println(bookInfo);

    }
}
