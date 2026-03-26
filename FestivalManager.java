import com.sun.source.tree.Tree;

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


        ticketCodex.add(t1.codice);
        ticketCodex.add(t2.codice);
        ticketCodex.add("TICK-582");
        ticketCodex.add("TICK-903");
        ticketCodex.add("TICK-123");
        System.out.println("Tickets entrati: " + ticketCodex);

        System.out.println("Numero partecipanti: " + ticketCodex.size());

        HashMap<String, String> matricole = new HashMap<>();

    }
}