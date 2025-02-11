package practice.ManipulaçãoString;

import java.util.LinkedList;
import java.util.List;

public class ListaDeStrings {
    List<String> lista = new LinkedList<>();

    public void adicionarElemento(String elemento) {
        lista.add(elemento);
    }

    public void removerElemento(String elemento) {
        lista.remove(elemento);
    }

    public void modificarElemento(int indice, String elemento){
        lista.set(indice, elemento);
    }

    public void listarElementos(){
        for (String elementos : lista) {
            System.out.println(elementos);
        }
    }
}
