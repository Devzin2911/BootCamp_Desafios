package AulaMap.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }


    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }


    public void obterProximoEvento() {
     //   Set<LocalDate> dateSet = eventoMap.keySet();
     //   Collections<Evento> values = eventoMap.values();
     // eventoMap.get()

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
                break;
            }
        }
    }


    public static void main(String[] args) {
        AgendaEventos agendandoEventos = new AgendaEventos();

        agendandoEventos.adicionarEvento(LocalDate.of(2025, Month.JULY, 02), "Evento 01", "Bruno Mars");
        agendandoEventos.adicionarEvento(LocalDate.of(2025, Month.MAY, 17), "Evento 02", "Novo Filme da Marvel");
        agendandoEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 21), "Evento 03", "Páscoa");

        agendandoEventos.exibirAgenda();

    }
}
