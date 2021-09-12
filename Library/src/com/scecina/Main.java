package com.scecina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Crap", 500, "Someone");
        ScienceBook book2 = new ScienceBook("SciBook", 435, "Anotherone", "Math");
        ForeignBook book3 = new ForeignBook("ForeinBook", 300, "AndAnother", "Eng");

        Customer customer1 = new Customer("Janko", "Hrasko", "dakde", 1, "Kosice" , "Slovensko");
        Customer customer2 = new Customer("Jon", "Doe", "dakde", 1, "Kosice" , "Slovensko");
        Customer customer3 = new Customer("Jane", "Doe", "dakde", 1, "Kosice" , "Slovensko");


        System.out.println(customer1);
        Library library = new Library();
        BorrowingSystem borrowingSystem = new BorrowingSystem(library);
        borrowingSystem.arrangeBooks();


        library.setBooks(book1);
        library.setBooks(book2);
        library.setBooks(book3);
        library.setCustomer(customer1);
        library.setCustomer(customer2);
        library.setCustomer(customer3);


//
        int start = 1;

        while (start!=0){

            System.out.print("""
                0 - Exit application \s
                1 - Create book, 2 - Create science book \s
                3 - Create foreign book, 4 - Create customer, 5 - Show books \s
                6 - Show customers, 7 - Change customer address  \s
                8 - Borrow book, 9 - Return book \s
                Enter action: \s""");

            Scanner menuScan = new Scanner(System.in);
            int menu = menuScan.nextInt();

            switch (menu) {

                case 0:
                    start = 0;
                    break;

                case 1:
                    System.out.println("Please add a normal book");
                    System.out.println("Please enter book Title");
                    Scanner titleScan = new Scanner(System.in);
                    String bTitle = titleScan.nextLine();
                    System.out.println("Please enter number of pages");
                    Scanner pageScan = new Scanner(System.in);
                    int bPage = pageScan.nextInt();
                    System.out.println("Please enter Authors name");
                    Scanner authorScan = new Scanner(System.in);
                    String bAuth = authorScan.nextLine();
                    Book newBook = new Book(bTitle,bPage,bAuth);
                    library.setBooks(newBook);
                    borrowingSystem.arrangeBooks();
                    System.out.println("All the books the library owns: ");
                    library.arrayToString();
                    System.out.println("Books you can borrow: ");
                    borrowingSystem.booksInLibList();
                    System.out.println("Books that are borrowed: ");
                    borrowingSystem.borrowedBooksList();
                    break;

                case 2:
                    System.out.println("Please add a science book");
                    System.out.println("Please enter book Title");
                    Scanner sciTitleScan = new Scanner(System.in);
                    String sciBTitle = sciTitleScan.nextLine();
                    System.out.println("Please enter number of pages");
                    Scanner sciPageScan = new Scanner(System.in);
                    int sciBPage = sciPageScan.nextInt();
                    System.out.println("Please enter Authors name");
                    Scanner sciAuthorScan = new Scanner(System.in);
                    String sciBAuth = sciAuthorScan.nextLine();
                    System.out.println("Please enter Science field name");
                    Scanner sciFieldScan = new Scanner(System.in);
                    String sciField = sciFieldScan.nextLine();
                    ScienceBook sciNewBook = new ScienceBook(sciBTitle,sciBPage,sciBAuth,sciField);
                    library.setBooks(sciNewBook);
                    library.arrayToString();
                    break;

                case 3:
                    System.out.println("Please add a foreign book");
                    System.out.println("Please enter book Title");
                    Scanner forTitleScan = new Scanner(System.in);
                    String forBTitle = forTitleScan.nextLine();
                    System.out.println("Please enter number of pages");
                    Scanner forPageScan = new Scanner(System.in);
                    int forgBPage = forPageScan.nextInt();
                    System.out.println("Please enter Authors name");
                    Scanner forAuthorScan = new Scanner(System.in);
                    String forBAuth = forAuthorScan.nextLine();
                    System.out.println("Please enter Science field name");
                    Scanner forFieldScan = new Scanner(System.in);
                    String forField = forFieldScan.nextLine();
                    ForeignBook forNewBook = new ForeignBook(forBTitle,forgBPage,forBAuth,forField);
                    library.setBooks(forNewBook);
                    library.arrayToString();
                    break;

                case 4:
                    System.out.println("Please add new customer");
                    System.out.println("Please enter customer first name: ");
                    Scanner nameScan = new Scanner(System.in);
                    String customerName = nameScan.nextLine();
                    System.out.println("Please enter customer last name: ");
                    Scanner surnnameScan = new Scanner(System.in);
                    String customerSurname = surnnameScan.nextLine();
                    System.out.println("Please enter adress ");
                    Scanner adressScan = new Scanner(System.in);
                    String customerAdress = adressScan.nextLine();
                    System.out.println("Please enter adress number ");
                    Scanner adressNumScan = new Scanner(System.in);
                    int customerAdressNum = adressNumScan.nextInt();
                    System.out.println("Please enter city ");
                    Scanner cityScan = new Scanner(System.in);
                    String customerCity = cityScan.nextLine();
                    System.out.println("Please enter country");
                    Scanner countryScan = new Scanner(System.in);
                    String customerCountry = countryScan.nextLine();
                    Customer customer = new Customer(customerName,customerSurname,customerAdress,customerAdressNum,customerCity,customerCountry);
                    library.setCustomer(customer);
                    library.customerArrayToString();
                    break;

                case 5:
                    System.out.println("-------------------------------------------------------------");
                    borrowingSystem.arrangeBooks();
                    System.out.println("All the books the library owns: ");
                    library.arrayToString();
                    System.out.println("Books you can borrow: ");
                    borrowingSystem.booksInLibList();
                    System.out.println("Books that are borrowed: ");
                    borrowingSystem.borrowedBooksList();
                    System.out.println("-------------------------------------------------------------");
                    break;

                case 6:
                    System.out.println("-------------------------------------------------------------");
                    library.customerArrayToString();
                    System.out.println("-------------------------------------------------------------");
                    break;

                case 7:
                    library.customerArrayToString();
                    System.out.println("Please select customer to edit adress by customer number");

                    Scanner customerNumberScan = new Scanner(System.in);
                    int customerNumber = customerNumberScan.nextInt() - 1;
                    System.out.println("please enter new adress: ");
                    Scanner newAdressScan = new Scanner(System.in);
                    String newAderess = newAdressScan.nextLine();
                    System.out.println("please enter address number");
                    Scanner newAddnumScan = new Scanner(System.in);
                    int newAddNum = newAddnumScan.nextInt();
                    library.customerList.get(customerNumber).setAdress(newAderess);
                    library.customerList.get(customerNumber).setAdressNumber(newAddNum);
                    library.customerArrayToString();

                case 8:
                    borrowingSystem.arrangeBooks();
                    System.out.println("Books you can borrow: ");
                    borrowingSystem.booksInLibList();
                    System.out.println("Books that are borrowed: ");
                    borrowingSystem.borrowedBooksList();
                    System.out.println("Please pick customer");
                    library.customerArrayToString();
                    Scanner custIDScan = new Scanner(System.in);
                    int custID = custIDScan.nextInt();
                    System.out.println("Please pick book to borrow");
                    Scanner bookIDScan = new Scanner(System.in);
                    int bookID = bookIDScan.nextInt();
                    borrowingSystem.borrowBook(custID, bookID);
                    borrowingSystem.arrangeBooks();
                    System.out.println("Books you can borrow: ");
                    borrowingSystem.booksInLibList();
                    System.out.println("Books that are borrowed: ");
                    borrowingSystem.borrowedBooksList();
                    break;

                case 9:


                    library.customerArrayToString();
                    System.out.println("Please select a customer");
                    Scanner returncustIDScan = new Scanner(System.in);
                    int returncustID = returncustIDScan.nextInt();
                    borrowingSystem.customerBorwedBooks(returncustID);
                    System.out.println("Please select a book to return");
                    Scanner returnbookIDScan = new Scanner(System.in);
                    int returnbookID = returnbookIDScan.nextInt();
                    borrowingSystem.returnBook(returncustID, returnbookID);
                    break;
            }


        }



    }
}
