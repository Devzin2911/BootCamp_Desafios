package setInterface.OpBasicas;

import java.util.HashSet;
import java.util.Set;

public class conjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public conjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }


    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadosSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }


    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }


    public static void main(String[] args) {
        conjuntoConvidados cc = new conjuntoConvidados();
        System.out.println("Existem " + cc.contarConvidados() + " dentro do set de Convidados");

        cc.adicionarConvidado("Convidado 1", 124321);
        cc.adicionarConvidado("Convidado 2", 124322);
        cc.adicionarConvidado("Convidado 3", 124332);
        cc.adicionarConvidado("Convidado 4", 124334);

        System.out.println("Existem " + cc.contarConvidados() + " dentro do set de Convidados");

        cc.removerConvidadoPorCodigo(124321);

        System.out.println("Existem " + cc.contarConvidados() + " dentro do set de Convidados");

        cc.exibirConvidados();

    }
}
