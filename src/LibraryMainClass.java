import java.util.List;

public class LibraryMainClass {
    public static void main(String[] args) {
        Author author1 = new Author("James Patterson", "jpatterson@gmail.com", 'M');
        Book book1 = new Book("Alex Cross", author1, 14.99, 10);

        Author author2 = new Author("Elizabeth Day", "eezyday@hotmail.com", 'F');
        Book book2 = new Book("Magpie", author2, 4.59, 2);

        Author author3 = new Author("Joshua Tree", "josh52@outlook.com", 'M');
        Book book3 = new Book("The Cat In A Hat", author3, 11.99, 3);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        List<Book> books = library.getBooks();
        for (Book book: books){
            System.out.println("\nTitle: " + book.getName());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Quantity in stock: " + book.getQty());
            System.out.println("Price: " + " £" + book.getPrice());

        }
    }

}


