package LibrarySystem;

import java.util.Scanner;

public class MainMenu {
    public void mainMenu() {
        Student student = new Student();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Register A Book");
            System.out.println("2. Register A Student");
            System.out.println("3. See Student Info");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                case 1:
                    Book book = new Book();
                    System.out.println("Enter The Book Name: ");
                    book.setTitle(input.nextLine());
                    System.out.println("Enter The Book Number: ");
                    book.setNumber(input.nextInt());
                    input.nextLine(); 

                    Author author = new Author();
                    System.out.println("Enter The Book Author's Name: ");
                    author.setName(input.nextLine());
                    System.out.println("Enter The Book Author's Address: ");
                    author.setAddress(input.nextLine());
                    System.out.println("Enter The Book Author's ID: ");
                    author.setId(input.nextInt());
                    input.nextLine();
                    System.out.println("Enter The Book Author's BirthDate (day month year): ");
                    author.setBirthDate(new BirthDate(input.nextInt(), input.nextInt(), input.nextInt()));
                    input.nextLine();
                    book.setAuthor(author);

                    System.out.println("Enter The Book Edition: ");
                    book.setEdition(input.nextInt());
                    input.nextLine();

                    System.out.println("Enter The Book Date: ");
                    book.setDate(input.nextInt());
                    input.nextLine();

                    System.out.println("Enter The Book Genre: ");
                    book.setGenre(input.nextLine());
                    student.loanBook(book);

                    break;
                case 2:
                    System.out.println("Enter The Student ID : ");
                    student.setId(input.nextInt());
                    input.nextLine();  
                    System.out.println("Enter The Student Name : ");
                    student.setName(input.nextLine());
                    System.out.println("Enter The Student Birth Date (day month year): ");
                    student.setBirthDate(new BirthDate(input.nextInt(), input.nextInt(), input.nextInt()));
                    input.nextLine();  
                    System.out.println("Enter The Student Address : ");
                    student.setAddress(input.nextLine());
                    System.out.println("Enter The Student Major : ");
                    student.setMajor(input.nextLine());
                    break;

                case 3:
                    student.getBooksInfo();
                    break;  

                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 0);

        input.close();
    }

    
}
