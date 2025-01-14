package atividadesM2.Ativi3;

import com.google.gson.Gson;

public class ConversaoJson {
    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Diário de Anne Frank\",\"autor\":\"Anne Frank\",\"editora\":{\"nome\":\"Record\",\"cidade\":\"Rio de Janeiro\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto Livro: " + livro);
    }
}
