import java.util.ArrayList;
import java.util.List;
public class Dipartimento {
    private String nome;
    private List<Docente> docenti;
    private List<Progetto> progetti;

    public Dipartimento(String nome) {
        this.nome = nome;
        this.docenti = new ArrayList<>();
        this.progetti = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Docente> getDocenti() {
        return docenti;
    }
    public void aggiungiDocente(Docente docente) {
        docenti.add(docente);
    }

    public void rimuoviDocente(Docente docente) {
        docenti.remove(docente);
    }
    public List<Progetto> getProgetti() {
        return progetti;
    }
    public void aggiungiProgetto(Progetto progetto) {
        progetti.add(progetto);
    }

    public List<Docente> trovaDocentiDelProgetto(String titoloProgetto) {
        List<Docente> membriProgetto = new ArrayList<>();
        for (Progetto progetto : progetti) {
            if (progetto.getTitolo().equals(titoloProgetto)) {
                membriProgetto.addAll(progetto.getMembri());
                break;
            }
        }
        return membriProgetto;
    }
}