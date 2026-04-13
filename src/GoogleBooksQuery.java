import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class GoogleBooksQuery {


    public GoogleBooks bookQuery(String book) {
        String encodedBook = URLEncoder.encode(book, StandardCharsets.UTF_8);
        URI url = URI.create("https://www.googleapis.com/books/v1/volumes?q=" + encodedBook);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .GET()
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new BookQueryError("Erro ao consultar a API de livros.");
            }

            GoogleBooks googleBooks = new Gson().fromJson(response.body(), GoogleBooks.class);
            if (googleBooks.items() == null || googleBooks.items().isEmpty()) {
                throw new BookQueryError("O livro não foi encontrado.");
            }

            return googleBooks;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public Book convertToBook(GoogleBooks response) {

        GoogleBooksItem item = response.items().get(0);
        GoogleBooksVolumeInfo volumeInfo = item.volumeInfo();

        String title = volumeInfo.title();

        if (title == null || title.isEmpty()) {
            title = "Titulo desconhecido";
        }

        String author;
        if (volumeInfo.authors() == null || volumeInfo.authors().isEmpty()) {
            author = "Autor desconhecido";
        } else {
            author = volumeInfo.authors().get(0);
        }
        return new Book(title, author, true);
    }

}
