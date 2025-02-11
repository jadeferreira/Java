package practice.ManipulaçãoString;

public class Principal {
    public static void main(String[] args) {

        ListaDeStrings lista = new ListaDeStrings();
        lista.adicionarElemento("Comprar frutas");
        lista.adicionarElemento("Comprar produtos de limpeza");
        lista.adicionarElemento("Comprar carne");
        lista.adicionarElemento("Comprar pão");

        System.out.println("Lista: ");
        lista.listarElementos();
        System.out.println();

        lista.removerElemento("Comprar carne");
        System.out.println("Lista após a remoção: ");
        lista.listarElementos();
        lista.modificarElemento(1, "Comprar leite");

        System.out.println();
        System.out.println("Lista após modificação: ");
        lista.listarElementos();

    }
}
