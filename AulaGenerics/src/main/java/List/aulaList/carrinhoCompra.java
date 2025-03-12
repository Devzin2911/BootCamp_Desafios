package List.aulaList;

import java.util.ArrayList;
import java.util.List;

public class carrinhoCompra {

    private List<Item> carrinho;

    public carrinhoCompra() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.carrinho.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : carrinho) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            } else {
                System.out.println("A lista está vazia!");
            }
        }
        carrinho.removeAll(itensParaRemover);
    }


    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!carrinho.isEmpty()) {
            for (Item i : carrinho) {
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }



    public void exibirItens() {
        if (!carrinho.isEmpty()) {
            System.out.println(this.carrinho);
        } else {
            System.out.println("A lista está vazia!");
        }

    }


    @Override
    public String toString() {
        return "carrinhoCompra{" +
                "itens=" + carrinho +
                '}';
    }

    public static void main(String[] args) {

      carrinhoCompra carrinho = new carrinhoCompra();

      carrinho.adicionarItem("MousePad", 23.65, 1);
      carrinho.adicionarItem("Monitor Portatil", 623.65, 1);
      carrinho.adicionarItem("HeadSet Logitech", 423.65, 1);
      carrinho.adicionarItem("Mouse Ergonomico", 223.65, 1);
      carrinho.adicionarItem("suporte para fone", 54.00, 1);

      carrinho.exibirItens();


      carrinho.removerItem("suporte para fone");


      carrinho.exibirItens();


        System.out.println("O valor total da compra é de " + carrinho.calcularValorTotal());


    }

}
