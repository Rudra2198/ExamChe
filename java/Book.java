package java;
public class Book {

    int no;
    String Title, Author;
    char Status;

    Book(int no, String Title, String Author, char Status){
        this.no = no;
        this.Title = Title;
        this.Author = Author;
        this.Status = Status;
    }

    public void print(){

        System.out.println("------------------------------------------------------------------------");
        System.out.println("  Book No.     Book Title     Author                         Status     ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("  " + no + "     " + Title + "     " + Author + "                         " + Status);
        System.out.println("------------------------------------------------------------------------");

    }

    public void Issue(){
        System.out.println("The current status of the book is " + Status);
        
        if(Status == 'I'){
            System.out.println("The book is already issued");
        }
        else{
            Status = 'I';
            System.out.println("The book is now issued");
        }
    }

    public void Return(){
        System.out.println("The current status of the book is " + Status);
        
        if(Status == 'A'){
            System.out.println("The book is already returned");
        }
        else{
            Status = 'A';
            System.out.println("The book is now returned!");
        }
    }

    public static void main(String[] args){

        Book B1 = new Book(219,"The Life of Ardur - Part 1"," Rudra Patel",'I');
        B1.print();  // Print the details of the book
        B1.Issue();  // Issue the book
        B1.Return(); // Return the book

        Book B2 = new Book(219,"The Life of Ardur - Part 2"," Rudra Patel",'A');
        B2.print();  // Print the details of the book
        B2.Issue();  // Issue the book
        B2.Return(); // Return the book

    }
}
