class Book {
    String title, author, genre, bookId;
    boolean available;
    Book next, prev;

    public Book(String title, String author, String genre, String bookId, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.available = available;
    }
}

class Library {
    Book head = null, tail = null;

    void addBookEnd(String title, String author, String genre, String bookId, boolean available) {
        Book b = new Book(title, author, genre, bookId, available);
        if (head == null) {
            head = tail = b;
        } else {
            tail.next = b;
            b.prev = tail;
            tail = b;
        }
    }

    void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " " + (temp.available ? "Available" : "Issued"));
            temp = temp.next;
        }
    }

    void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " " + (temp.available ? "Available" : "Issued"));
            temp = temp.prev;
        }
    }

    void updateAvailability(String bookId, boolean status) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId.equals(bookId)) {
                temp.available = status;
                break;
            }
            temp = temp.next;
        }
    }

    void countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total Books: " + count);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBookEnd("Book A", "Author1", "Fiction", "B001", true);
        lib.addBookEnd("Book B", "Author2", "Sci-Fi", "B002", false);
        lib.displayForward();
        lib.updateAvailability("B002", true);
        lib.displayReverse();
        lib.countBooks();
    }
}
