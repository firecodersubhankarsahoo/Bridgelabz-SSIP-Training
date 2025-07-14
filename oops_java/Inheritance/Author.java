public class Author extends Book {
	String name;
	String bio;
	public Author(String title, int year, String name, String bio) {
		super(title, year);
		this.name = name;
		this.bio = bio;
	}
	@Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
	
	public static void main(String[] args) {
		Author a1 = new Author("DBMS", 2001, "PV", "student");
		a1.displayInfo();
	}
	
	
	
}