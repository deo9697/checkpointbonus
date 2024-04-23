import java.util.ArrayList;
import java.util.List;

public class Progetto {
    private String titolo;
    private String descrizione;
    private List<Docente> membri;

    public Progetto(String titolo, String descrizione) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.membri = new ArrayList<>();
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public List<Docente> getMembri() {
        return membri;
    }

    public void aggiungiMembro(Docente docente) {
        membri.add(docente);
    }

    public void rimuoviMembro(Docente docente) {
        membri.remove(docente);
    }
}
