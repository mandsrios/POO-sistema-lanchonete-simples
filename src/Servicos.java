import java.util.ArrayList;
import java.util.Scanner;

public class Servicos {
    Scanner scanner = new Scanner(System.in);

    public Produto adicionarProduto(int id){

        System.out.println();

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        Produto produto = new Produto(id, nome, valor);

        System.out.println();
        System.out.println("Produto adicionado com sucesso!");
        System.out.println();


        return produto;
    }

    public void listarProdutos(ArrayList<Produto> produtos){

        System.out.println();

        if (produtos.isEmpty()){
            System.out.println("nâo existe nenhum produto cadastrado!");
            System.out.println();
            return;
        }

        System.out.println();
        System.out.println("Lista de produtos: ");

        for (int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i).toString());
        }

        System.out.println();

    }

    public void deletarProduto(ArrayList<Produto> produtos){

        System.out.println();

        if (produtos.isEmpty()){
            System.out.println("Não existe nenhum produto cadastrado para deletar!");
            System.out.println();
            return;
        }

        listarProdutos(produtos);
        System.out.println("Digite o id do produto que deseja deletar:");
        int idEscolhido = scanner.nextInt();

        for (int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).getId() == idEscolhido){
                produtos.remove(i);
                System.out.println();
                System.out.println("Produto removido com sucesso!");
                System.out.println();
                return;
            }
        }

        System.out.println("Id não encontrado!");
        System.out.println();
    }

    public void venderproduto(ArrayList<Produto> produtos){

        System.out.println();

        if (produtos.isEmpty()){
            System.out.println("Não existe nenhum produto cadastrado para vender!");
            System.out.println();
            return;
        }

        listarProdutos(produtos);
        System.out.println("Digite o id do produto que deseja vender:");

        int idVenda = scanner.nextInt();
        scanner.nextLine();

        Produto produtoSelecionado = null;
        for (int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).getId() == idVenda){
                produtoSelecionado = produtos.get(i);
                break;
            }
        }

        if(produtoSelecionado == null){
            System.out.println();
            System.out.println("Produto não encontrado");
            System.out.println();
            return;
        }

        System.out.println("Digite a quantidade de produto para vender: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        System.out.println();
        System.out.println("Venda realizada com sucesso!!");
        System.out.println("Total da venda: R$" + produtoSelecionado.getValor()*quantidade);
        System.out.println();
    }
}
