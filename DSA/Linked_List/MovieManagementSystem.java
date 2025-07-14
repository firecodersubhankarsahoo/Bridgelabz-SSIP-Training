class Movie {
    String title, director;
    int year;
    double rating;
    Movie prev, next;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class MovieList {
    Movie head, tail;

    void addFirst(String title, String director, int year, double rating) {
        Movie m = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = m;
        } else {
            m.next = head;
            head.prev = m;
            head = m;
        }
    }

    void addLast(String title, String director, int year, double rating) {
        Movie m = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = m;
        } else {
            tail.next = m;
            m.prev = tail;
            tail = m;
        }
    }

    void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                break;
            }
            temp = temp.next;
        }
    }

    void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                break;
            }
            temp = temp.next;
        }
    }

    void searchByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println(temp.title);
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.year + " " + temp.rating);
            temp = temp.prev;
        }
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieList ml = new MovieList();
        ml.addFirst("Inception", "Nolan", 2010, 8.8);
        ml.addLast("Interstellar", "Nolan", 2014, 8.6);
        ml.displayForward();
        ml.updateRating("Inception", 9.0);
        ml.displayReverse();
    }
}
