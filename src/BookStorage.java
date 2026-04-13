import java.util.ArrayList;
import java.util.List;

public class BookStorage {

    private List<Book> books = new ArrayList<>();

    public boolean addBook(Book book) {
        if (findBookByTitle((book.getTitle())) != null) {
            return false;
        }
        books.add(book);
        return true;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title.trim())) {
                return book;
            }
        }
        return null;
    }

}