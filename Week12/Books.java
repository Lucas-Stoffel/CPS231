package Week12;

public class Books {

    public static void main(String[] args) {

        // Example 3
        Book b1, b2;
        b1 = new Book("Thinking in Java", "Bruce Eckel", 1129);
        System.out.println(b1.title + ":" + b1.author +
                " : " + b1.numberOfPages + ":" + b1.ISBN);
        b2 = new Book("Thinking in Java", "Bruce Eckel", 1129,
                "0-13-027363-5");
        System.out.println(b2.title + ":" + b2.author +
                " : " + b2.numberOfPages + ":" + b2.ISBN);

        // Example 4
        Book b;
        b = new Book("Thinking in Java", "Bruce Eckel", 1129);
        System.out.println("Initials: " + b.getInitials());

        // Example 5
        Book[] a = new Book[3];
        a[0] = new Book("Thinking in Java", "Bruce Eckel", 1129);
        a[1] = new Book("Java in a nutshell", "David Flanagan", 353);
        a[2] = new Book("Java network programming", "Elliott Rusty Harold", 649);
        for (int i = 0; i < a.length; i++)
            System.out.println("Initials: " + a[i].getInitials());

        // Example 6
        Book b3, b4;
        b3 = new Book("Thinking in Java", "Bruce Eckel", 1129);
        b4 = new Book("Thinking in Java", "Bruce Eckel", 1129);
        if (b3 == b4)
            System.out.println("The two books are the same");
        else
            System.out.println("The two books are different");

        // Example 7
        if (b1.equals(b2))
            System.out.println("The two books are the same");
        else
            System.out.println("The two books are different");

        // Example 8
        Book b5, b6;
        b5 = new Book("Thinking in Java", "Bruce Eckel", 1129);
        b6 = new Book("Java in a nutshell", "David Flanagan", 353);
        b5.setOwner("Carlos Kavka");
        System.out.println("Owner of book b1: " + b5.getOwner());
        System.out.println("Owner of book b2: " + b6.getOwner());

        // Example 9
        System.out.println(b5.description());
        System.out.println(Book.description());

    }

}

class Book {
    String title;
    String author;
    int numberOfPages;
    String ISBN;
    static String owner;

    Book(String tit, String aut, int num) {
        title = tit;
        author = aut;
        numberOfPages = num;
        ISBN = "unknown";
    }

    Book(String tit, String aut, int num, String isbn) {
        title = tit;
        author = aut;
        numberOfPages = num;
        ISBN = isbn;
    }

    public String getInitials() {
        String initials = "";
        for (int i = 0; i < author.length(); i++) {
            char currentChar = author.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z')
                initials = initials + currentChar + '.';
        }
        return initials;
    }

    public boolean equals(Book b) {
        return (title.equals(b.title) &&
                author.equals(b.author) &&
                numberOfPages == b.numberOfPages &&
                ISBN.equals(b.ISBN));
    }

    public void setOwner(String name) {
        owner = name;
    }

    public String getOwner() {
        return owner;
    }

    public static String description() {
        return "Book instances can store information on books";
        }

}
