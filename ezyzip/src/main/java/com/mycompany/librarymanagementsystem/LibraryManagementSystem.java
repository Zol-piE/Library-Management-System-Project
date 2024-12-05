package com.mycompany.librarymanagementsystem;

import static com.mycompany.librarymanagementsystem.BookInfo.printBookInfo;

import java.util.Scanner;

public class LibraryManagementSystem {

    public static void displayBookInformation() {
        // Implement the logic to display book information
        System.out.println("Placeholder: Display Book Information");
        printBookInfo();
    }

    public static void addNewBook() {
        
        System.out.println("Placeholder: Add New Book");
        String book;
        Scanner scan = new Scanner(System.in);
        book = scan.nextLine();
        addbook.AddBook(book);
    }
    
    public static void displayTotalNumberOfBooks() {
        
        System.out.println("Placeholder: Display Total Number of Books");
        System.out.println(Total_Books.calculateTotalBooks());
    }

    public static void issueBook() {
       
        System.out.println("Placeholder: Issue a Book");
        String Book_Name;
        System.out.println("Enter Your Book Name You Want :");
        Scanner scan = new Scanner(System.in);
        Book_Name = scan.nextLine(); 
        Issue_Book.issue_book(Book_Name);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        
        Student[] members = new Student[]{
            new Student("B210101002"),
            new Student("B210101003"),
            new Student("B210101004"),
            new Student("B210101017"),
            new Student("B210101030")
        };
        System.out.println("Enter Your Unique ID: ");
        String uniqueId=scanner.nextLine();
        Boolean l = null;
        for(int i=0;i<5;i++)
        {
            l=members[i].cheack(uniqueId);
            if(l==true) break;
        }
        if(l==true)
        {
        do {
            System.out.println("Welcome To The Library of CSTU");
            System.out.println("1. Display Book Information");
            System.out.println("2. Add a New Book");
            System.out.println("3. Display Total Number of Books");
            System.out.println("4. Issue a Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0 -> System.out.println("Exiting the program.");
                case 1 -> displayBookInformation();
                case 2 -> addNewBook();
                case 3 -> displayTotalNumberOfBooks();
                case 4 -> issueBook();
                default -> System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        
    }
    else
    {
        System.out.println("You Are Not Registered");
    }

    scanner.close();
}
}
