package List.aulaList.AulaPesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;


    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
        } else {
            System.out.println("A lista está vazia");
        }
        return livroPorAutor;
    }


    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicio, int anoFim) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if(l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }


    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!listaLivros.isEmpty()) {
            for(Livro l : listaLivros) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalago = new CatalogoLivros();

        catalago.adicionarLivro("Livro 01", "Autor 01", 2020);
        catalago.adicionarLivro("Livro 01", "Autor 02", 2020);
        catalago.adicionarLivro("Livro 02", "Autor 02", 2020);
        catalago.adicionarLivro("Livro 03", "Autor 03", 2020);
        catalago.adicionarLivro("Livro 04", "Autor 04", 2020);


        System.out.println(catalago.pesquisarPorAutor("Autor 02"));

    }
}
