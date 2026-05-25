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

EXERCÍCIO 2
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> notas = new ArrayList<>();

        notas.add(7.5);
        notas.add(8.0);
        notas.add(6.5);
        notas.add(9.0);

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.size();

        System.out.println("Media da turma: " + media);

        if (media >= 7) {
            System.out.println("Turma aprovada");
        } else {
            System.out.println("Turma reprovada");
        }
    }
}
EXERCÍCIO 3
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> alunos = new HashSet<>();

        alunos.add("Joao");
        alunos.add("Maria");
        alunos.add("Pedro");
        alunos.add("Joao");
        alunos.add("Maria");

        System.out.println("Lista de alunos presentes:");

        for (String nome : alunos) {
            System.out.println(nome);
        }

        System.out.println("Quantidade de alunos: " + alunos.size());
    }
}
EXERCÍCIO 4
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> alunos = new HashMap<>();

        alunos.put(1, "Carlos");
        alunos.put(2, "Ana");
        alunos.put(3, "Bruno");

        System.out.println("Aluno da matricula 2: " + alunos.get(2));

        alunos.remove(3);

        System.out.println("Lista de alunos:");

        for (Integer matricula : alunos.keySet()) {
            System.out.println(matricula + " - " + alunos.get(matricula));
        }
    }
}
EXERCÍCIO 5
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Cliente 1");
        fila.add("Cliente 2");
        fila.add("Cliente 3");
        fila.add("Cliente 4");
        fila.add("Cliente 5");

        System.out.println("Proximo cliente: " + fila.peek());

        fila.poll();
        fila.poll();

        System.out.println("Fila atualizada:");

        for (String cliente : fila) {
            System.out.println(cliente);
        }
    }
}
EXERCÍCIO 6
Classe Livro
public class Livro {

    int codigo;
    String titulo;
    String autor;
    boolean disponivel;

    public Livro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
}
Classe Main
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Livro> livros = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Emprestar livro");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            if (opcao == 1) {

                System.out.println("Codigo:");
                int codigo = sc.nextInt();
                sc.nextLine();

                System.out.println("Titulo:");
                String titulo = sc.nextLine();

                System.out.println("Autor:");
                String autor = sc.nextLine();

                Livro livro = new Livro(codigo, titulo, autor);

                livros.add(livro);

                System.out.println("Livro cadastrado");

            } else if (opcao == 2) {

                for (Livro l : livros) {

                    System.out.println("Codigo: " + l.codigo);
                    System.out.println("Titulo: " + l.titulo);
                    System.out.println("Autor: " + l.autor);

                    if (l.disponivel) {
                        System.out.println("Disponivel");
                    } else {
                        System.out.println("Emprestado");
                    }

                    System.out.println("----------------");
                }

            } else if (opcao == 3) {

                System.out.println("Digite o codigo:");
                int codigo = sc.nextInt();

                for (Livro l : livros) {

                    if (l.codigo == codigo) {

                        if (l.disponivel) {
                            l.disponivel = false;
                            System.out.println("Livro emprestado");
                        } else {
                            System.out.println("Livro indisponivel");
                        }
                    }
                }

            } else if (opcao == 4) {

                System.out.println("Digite o codigo:");
                int codigo = sc.nextInt();

                for (Livro l : livros) {

                    if (l.codigo == codigo) {
                        l.disponivel = true;
                        System.out.println("Livro devolvido");
                    }
                }
            }
        }

        sc.close();
    }
}
EXERCÍCIO 7
Classe Pedido
public class Pedido {

    int numero;
    String cliente;
    String item;
    double valor;
    String status;

    public Pedido(int numero, String cliente, String item, double valor) {

        this.numero = numero;
        this.cliente = cliente;
        this.item = item;
        this.valor = valor;
        this.status = "PENDENTE";
    }
}