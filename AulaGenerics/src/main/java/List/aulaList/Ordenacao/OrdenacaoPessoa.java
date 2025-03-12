package List.aulaList.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> listaP;

    public OrdenacaoPessoa() {
        this.listaP = new ArrayList<>();
    }


    public void adicionarPessoa(String nome, int idade, double altura) {
        listaP.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(listaP);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    private List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(listaP);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordemPessoa = new OrdenacaoPessoa();
        
        ordemPessoa.adicionarPessoa("Nome 1", 20, 1.87);
        ordemPessoa.adicionarPessoa("Nome 2", 16, 1.74);
        ordemPessoa.adicionarPessoa("Nome 3", 19, 1.53);
        ordemPessoa.adicionarPessoa("Nome 4", 32, 1.96);


        System.out.println(ordemPessoa.ordenarPorAltura());
        System.out.println(ordemPessoa.ordenarPorIdade());
    }


}
