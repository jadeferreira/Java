package atividadesM2.Ativ1e2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoObjFlexivel {
    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Jade\",\"cidade\":\"Boston\"}";

        //Gson gson = new Gson(); - Biblioteca flexivel por padrão, não há erros quando campos estão ausentes. (Pode ser usado das duas formas)
        Gson gson = new GsonBuilder().setLenient().create();
        PessoaConversao pessoa = gson.fromJson(jsonPessoa, PessoaConversao.class);

        System.out.println("Objeto Pessoa flexivel: " + pessoa);
    }
}
