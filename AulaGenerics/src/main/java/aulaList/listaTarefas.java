package aulaList;

import java.util.ArrayList;
import java.util.List;

public class listaTarefas {

    private List<Tarefa> tarefaList;

    public listaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void addTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }


    public int obterTotalDeTarefas() {
        return  tarefaList.size();
    }


    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }


    public static void main(String[] args) {
        listaTarefas lista = new listaTarefas();
        System.out.println("O numero de elementos na lista: " + lista.obterTotalDeTarefas());

        lista.addTarefa("Tarefa 01");
        lista.addTarefa("Tarefa 02");
        lista.addTarefa("Tarefa 03");

        System.out.println("O numero de elementos na lista: " + lista.obterTotalDeTarefas());

        lista.obterDescricaoTarefa();
    }
}
