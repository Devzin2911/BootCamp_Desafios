package setInterface.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> setProduto;

    public CadastroProduto() {
        this.setProduto = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quantidade) {
        setProduto.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(setProduto);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreço() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(setProduto);
        return produtosPorPreco;
    }


    public static void main(String[] args) {
        CadastroProduto cadProd = new CadastroProduto();
        cadProd.adicionarProduto("Produto 1", 1L, 230.0, 23);
        cadProd.adicionarProduto("Produto 2", 2L, 2320.0, 48);
        cadProd.adicionarProduto("Produto 3", 1L, 7350.0, 32);
        cadProd.adicionarProduto("Produto 4", 9L, 310.0, 68);

        System.out.println(cadProd.setProduto);

        System.out.println(cadProd.exibirProdutosPorNome());

        System.out.println(cadProd.exibirProdutosPorPreço());
    }
}

