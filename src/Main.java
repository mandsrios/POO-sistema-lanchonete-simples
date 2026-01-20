import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Servicos servicos = new Servicos();
        ArrayList<Produto> produtos = new ArrayList<>();


        boolean parar = false;
        int id = 1;

        do{
            int opcao = menu(scanner);

            switch (opcao){
                case 1:
                    servicos.venderproduto(produtos);
                    break;
                case 2:
                    produtos.add(servicos.adicionarProduto(id));
                    id++;
                    break;
                case 3:
                    servicos.listarProdutos(produtos);
                    break;
                case 4:
                    servicos.deletarProduto(produtos);
                    break;
                case 5:
                    parar = true;
                    System.out.println("Encerrando...");
                    break;
            }

        }while (!parar);
    }

    public static int menu(Scanner scanner){
        System.out.println("Digite a opção desejada: ");
        System.out.println("[1] Vender produto");
        System.out.println("[2] Adicionar produto");
        System.out.println("[3] Listar produtos");
        System.out.println("[4] Deletar produto");
        System.out.println("[5] Sair (Encerrar programa)");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        return opcao;
    }
}

