import Entidades.Produtos;

public class Main {
    public static void main(String[] args) {

        Produtos produto = new Produtos("café",35.0, 80);

        System.out.println("Há " + produto.getQuantidade() + " pacotes de "
                + produto.getNome() + " no estoque no valor de  " + produto.getPreco());

    }
}