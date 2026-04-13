import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class BookFileGenerator {

    public void jsonGenerator(GoogleBooks book) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        if(book.items().get(0) == null || book.items().isEmpty()){
            throw new IOException("Nenhum livro foi encontrado.");
        }

        String title = book.items().get(0).volumeInfo().title();

        if (title == null || title.isEmpty()) {
            title = "livro";
        }

        title = title.replaceAll("[^a-zA-Z0-9]","_");

        try (FileWriter file = new FileWriter(title + ".json")) {
            file.write(gson.toJson(book));
        }

    }
}