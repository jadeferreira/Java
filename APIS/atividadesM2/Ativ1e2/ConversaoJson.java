package atividadesM2.Ativ1e2;

import com.google.gson.Gson;

public class ConversaoJson {
    public static void main(String[] args) {

        String jsonPessoa = "{\"nome\":\"Jade\",\"idade\":19,\"cidade\":\"Boston\"}";

        Gson gson = new Gson();
        PessoaConversao pessoa = gson.fromJson(jsonPessoa, PessoaConversao.class);
        System.out.println("Objeto pessoa: " + pessoa);



    }
}
