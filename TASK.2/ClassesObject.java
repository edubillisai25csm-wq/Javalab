public class ClassesObject
 {
    int bookId;
    String bookName;
    String author;
    double price;

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        ClassesObject cs=new ClassesObject();

        cs.bookId=18;
        cs.bookName="Saipublishers";
        cs.author="sai";
        cs.price=1000;

        cs.display();
    }
}

