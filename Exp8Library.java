class Exp8Library {
    // Static nested class
    static class Book {
        private String title;
        private String author;
        private String ISBN;

        // Constructor
        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }

        // Method to display book details
        public void displayDetails() {
            System.out.println("Book Details:");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creating an instance of the nested static class
        Exp8Library.Book book = new Exp8Library.Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        
        // Calling the displayDetails method
        book.displayDetails();
    }
}
