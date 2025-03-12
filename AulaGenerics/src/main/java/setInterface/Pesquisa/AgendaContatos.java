package setInterface.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }


    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getName().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }


    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if(c.getName().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agContatos = new AgendaContatos();

        agContatos.exibirContatos();

        agContatos.adicionarContato("Ana", 1234432);
        agContatos.adicionarContato("Ana", 0);
        agContatos.adicionarContato("Ana Carolina", 12332322);
        agContatos.adicionarContato("Ana DIO", 112222111);

        agContatos.exibirContatos();

        System.out.println(agContatos.pesquisarPorNome("Ana"));

        System.out.println("Contato Atualizado: " + agContatos.atualizarNumeroContato("Ana DIO", 2198316));
    }
}
