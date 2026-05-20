EXERCÍCIO 1

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        
        produtos.add("Arroz");
        produtos.add("Feijao");
        produtos.add("Macarrao");
        produtos.add("Leite");
        produtos.add("Cafe");
        
        System.out.println("Lista de compras: ");
        for (String produto : produtos) {
            System.out.println(produto);
        }
        
        System.out.println("Quantidade total: " + produtos.size());
    }
}
