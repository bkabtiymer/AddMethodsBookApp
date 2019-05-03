package com.company;
///*Create a method that returns the pricing for a requested number of books. Five books at $20.00 should return $100, if they are in stock. If they are not in stock, that should be handled appropriately (hint - you decide).*

import java.util.Scanner;

public class BookclassApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Create an object of the book class
        book mesaf = new book();

        System.out.print("Purchase Invoice \n");
        System.out.println("-------------------------");
//        Set Book Information: Title, Author short Description
        mesaf.setTitle("Title: Lean in: Women Work and the Will to Lead \n");
        mesaf.setAuthor("Author: Sheryl Sandberg \n");
        mesaf.setDescription("Description: Biography\n");
//       Specify if book is in stock or not using boolean
        mesaf.setStock(true);
//        Prompt the user to select amount of book to be purchased
        System.out.println("Enter quantity of books wanted: ");
        mesaf.setQuantity(input.nextInt());
//       Set price per book
        mesaf.setPrice(20.00);
        String bookInfo = mesaf.getDisplayText();
        System.out.println(bookInfo);
//        If the book is in stock, calculate the totla price of book
        boolean qPrice = mesaf.getStock();
        System.out.println("The total Price is: " + mesaf.getPrice());


    }
}

