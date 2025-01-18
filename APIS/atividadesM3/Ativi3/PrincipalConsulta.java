package atividadesM3.Ativi3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConsulta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o usuário da pessoa que deseja buscar no GitHub: ");
        String user = sc.next();

        String endereco = "https://api.github.com/users/" + user;

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    //.header("Accept", "application/vmd.github.v3+json")
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() != 200){
                throw new ErroConsultaGitHubException("User não encontrado!");
            }

            System.out.println(response.body());

        }catch (IOException | InterruptedException e){
            System.out.println("Houve um erro na consulta a API do GitHub");
        }
        catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());

        }
    }

}
