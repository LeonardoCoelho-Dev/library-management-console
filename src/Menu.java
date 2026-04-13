import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);
    private BookStorage bookStorage = new BookStorage();
    private GoogleBooksQuery googleBooksQuery = new GoogleBooksQuery();

    public void initializeMenu() {

        while (true) {
            System.out.println("1 - Para adicionar um livro.");
            System.out.println("2 - Para Mostrar os livros adicionados.");
            System.out.println("3 - Para emprestar o livro");
            System.out.println("4 - Devolver livro.");
            System.out.println("5 - Buscar livro na API");
            System.out.println("0 - Para sair.");

            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    addBook();
                    break;

                case 2:
                    listBooks();
                    break;

                case 3:
                    lendBook();
                    break;
                case 4:
                    returnBook();
                    break;

                case 5:
                    searchBookFromApi();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Essa opção não existe!");
            }
        }

    }

    public void lendBook() {
        System.out.println("Digite o título do livro: ");
        String title = input.nextLine();
        Book book = bookStorage.findBookByTitle(title);

        if (book == null) {
            System.out.println("Este livro não foi encontrado.");
            return;
        }
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("O livro " + book.getTitle() + " foi emprestado com sucesso!");
        } else {
            System.out.println("O livro ja foi emprestado.");
        }
    }

    public void returnBook() {
        System.out.println("Digite o titulo do livro: ");
        String title = input.nextLine().trim();
        Book book = bookStorage.findBookByTitle(title);
        if (book == null) {
            System.out.println("Livro não encontrado.");
            return;
        }
        if (!book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Livro " + book.getTitle() + " foi devolvido com sucesso!");
        } else {
            System.out.println("O livro já está disponível.");
        }
    }

    public void listBooks() {
        if (bookStorage.getBooks().isEmpty()) {
            System.out.println("Sua lista está vazia.");
            return;
        }
        for (Book book : bookStorage.getBooks()) {

            System.out.println(book);
        }
    }

    public void addBook() {
        System.out.println("Digite o titulo do livro: ");
        String title = input.nextLine().trim();
        System.out.println("Digite o nome do autor do livro: ");
        String author = input.nextLine().trim();

        Book book = new Book(title, author, true);
        if (bookStorage.addBook(book)) {
            System.out.println("O livro " + book.getTitle() + " foi adicionado com sucesso!");
        } else {
            System.out.println("Esse livro ja está cadastrado.");
        }


    }

    public void searchBookFromApi() {
        System.out.println("Digite o titulo do livro: ");
        String title = input.nextLine().trim();

        try {
            GoogleBooks response = googleBooksQuery.bookQuery(title);
            Book book = googleBooksQuery.convertToBook(response);
            if (bookStorage.addBook(book)) {
                System.out.println("O livro " + book.getTitle() + " foi encontrado e adicionado com sucesso!");
            } else {
                System.out.println("Esse livro ja está cadastrado.");
            }

        } catch (BookQueryError e) {
            System.out.println(e.getMessage());
        }
    }
}

