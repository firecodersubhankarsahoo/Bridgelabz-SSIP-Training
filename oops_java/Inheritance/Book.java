public class Book {
	String title;
	int publicationYear;
	public Book(String title, int pubYear) {
		this.title = title;
		this.publicationYear = pubYear;
	}
	public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}