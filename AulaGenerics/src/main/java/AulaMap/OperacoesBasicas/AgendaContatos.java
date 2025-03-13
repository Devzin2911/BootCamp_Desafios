package AulaMap.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContato;

    public AgendaContatos() {
        this.agendaContato = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        agendaContato.put(nome, numero);
    }

    public void removerContato(String nome) {
        if(!agendaContato.isEmpty()) {
            agendaContato.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContato);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContato.isEmpty()) {
            numeroPorNome = agendaContato.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agContatoSet = new AgendaContatos();
        agContatoSet.adicionarContato("Ana", 219765);
        agContatoSet.adicionarContato("Camila", 219343);
        agContatoSet.adicionarContato("Zoe", 219877);
        agContatoSet.adicionarContato("Ana Carolina", 219001);
        agContatoSet.adicionarContato("Ana DIO", 219123);
        agContatoSet.adicionarContato("Ana", 2193455);

        agContatoSet.exibirContato();

        agContatoSet.removerContato("Camila");

        agContatoSet.exibirContato();

        System.out.println("O numero é " + agContatoSet.pesquisarPorNome("Ana"));
    }
}
