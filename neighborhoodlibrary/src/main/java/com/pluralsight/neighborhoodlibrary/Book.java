public class Book {
    // Properties
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Constructor
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    // Method to check out a book
    public void checkOut(String name) {
        if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println(title + " checked out to " + name);
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    // Method to check in a book
    public void checkIn() {
        if (isCheckedOut) {
            checkedOutTo = "";
            isCheckedOut = false;
            System.out.println(title + " has been checked in.");
        } else {
            System.out.println(title + " is not checked out.");
        }
    }
}

