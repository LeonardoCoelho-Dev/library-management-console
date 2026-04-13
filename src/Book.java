public class Book {

    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;

    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getStatus(){
        return available ? "Disponível" : "Emprestado";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {

        return "Titulo do livro: " + title + "\nAutor: " + author +"\nStatus: " + getStatus();
    }


}
