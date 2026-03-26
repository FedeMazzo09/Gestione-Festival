import java.util.*;

public class FestivalManager{
    public static void main(String[] args){
        FestivalManager fm = new FestivalManager();
        fm.gestioneScaletta();
        fm.gestioneBiglietti();
    }

    public void gestioneScaletta(){
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Eminem");
        lista.add("Katy Perry");
        lista.add("Lady Gaga");
        lista.add("Michael Jackson");
        lista.add("Billie Eilish");
        System.out.println("Cantanti: " + lista);

        lista.remove(3);
        System.out.println("Cantanti: " + lista);

        lista.add(1, "Frank Sinatra");
        System.out.println("Cantanti: " + lista);
    }

    public void gestioneBiglietti(){
        TreeSet<String> ticketCodex = new TreeSet<>();

        Ticket t1 = new Ticket("TICK-123");
        Ticket t2 = new Ticket("TICK-147");
        Ticket t3 = new Ticket("TICK-582");
        Ticket t4 = new Ticket("TICK-903");
        Ticket t5 = new Ticket("TICK-123");
        Ticket t6 = new Ticket("TICK-999");

        ticketCodex.add(t1.codice);
        ticketCodex.add(t2.codice);
        ticketCodex.add(t3.codice);
        ticketCodex.add(t4.codice);
        ticketCodex.add(t5.codice);
        ticketCodex.add(t6.codice);
        System.out.println("Tickets entrati: " + ticketCodex);

        System.out.println("Numero partecipanti: " + ticketCodex.size());

        HashMap<String, String> matricole = new HashMap<>();
        matricole.put(t1.codice, "Deyae Bellafkih");
        matricole.put(t2.codice, "Mazzoleni Simone");
        matricole.put(t3.codice, "Giacomo Rota");
        matricole.put(t4.codice, "Ilario Suardi");
        matricole.put(t5.codice, "Deyae Bellafkih");
        matricole.put(t6.codice, "Zakaria El Haiki");
        System.out.println("Associazione Ticket-Nome: " + matricole);

        if(matricole.containsKey(t3.codice)){
            System.out.println("Benvenuto: " + matricole.get(t3.codice));
        } else {
            System.out.println("Accesso negato");
        }
    }
}