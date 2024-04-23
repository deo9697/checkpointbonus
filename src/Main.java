/***Traccia Bonus**
        **Classe Progetto e Dipartimento:**
        - Crea una classe `Progetto` con attributi titolo, descrizione e lista dei membri (istanze di `Docente`).
        - Crea una classe `Dipartimento` che rappresenta un dipartimento universitario, con attributi nome, lista dei docenti appartenenti e lista dei progetti in corso.
        - Implementa un metodo per aggiungere un nuovo progetto al dipartimento e un metodo per trovare i docenti che partecipano a un determinato progetto.
   - Utilizza la classe e la funzione nel main*/
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Docente docente1 = new Docente("Mario", "Rossi", 40, "001");
        Docente docente2 = new Docente("Giulia", "Bianchi", 35, "002");
       // Docente docente3 = new Docente("Mario" , "Ritaglio" , 61 , "003");

        // Creazione di un progetto con alcuni membri

        Progetto progetto1 = new Progetto("Progetto1", "Descrizione progetto 1");
        progetto1.aggiungiMembro(docente1);
        progetto1.aggiungiMembro(docente2);

        // Creazione di un dipartimento
        Dipartimento dipartimento = new Dipartimento("Dipartimento di Informatica");

        // Aggiunta dei docenti al dipartimento
        dipartimento.aggiungiDocente(docente1);
        dipartimento.aggiungiDocente(docente2);

        // Aggiunta di un progetto al dipartimento
        dipartimento.aggiungiProgetto(progetto1);

        // Trova i docenti partecipanti a un progetto specifico
        String titoloProgetto = "Progetto1";
        List<Docente> membriProgetto = dipartimento.trovaDocentiDelProgetto(titoloProgetto);

        // Stampa i membri del progetto
        System.out.println("Docenti che partecipano al progetto " + titoloProgetto + ":");
        for (Docente docente : membriProgetto) {
            System.out.println(docente.getNome() + " " + docente.getCognome());
        }
    }
}