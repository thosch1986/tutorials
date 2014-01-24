package model;
import java.util.List;

/**
 * Fachklasse als JavaBean
 * @author thorsten.schmidt
 */
public class Aktion {
    private String name;
    private Double spendenZiel;
    private Double spendenBetrag;
    private Double bisherGespendet;
    private Konto konto;
    private Long id;
    private List<Spende> spenden;

    public Aktion() {
        konto = new Konto();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getSpendenZiel() {
        return spendenZiel;
    }
    public void setSpendenZiel(Double spendenZiel) {
        this.spendenZiel = spendenZiel;
    }

    public Double getSpendenBetrag() {
        return spendenBetrag;
    }
    public void setSpendenBetrag(Double spendenBetrag) {
        this.spendenBetrag = spendenBetrag;
    }

    public Double getBisherGespendet() {
        return bisherGespendet;
    }
    public void setBisherGespendet(Double bisherGespendet) {
        this.bisherGespendet = bisherGespendet;
    }

    public Konto getKonto() {
        return konto;
    }
    public void setKonto(Konto konto) {
        this.konto = konto;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public List<Spende> getSpenden() {
        return spenden;
    }
    public void setSpenden(List<Spende> spenden) {
        this.spenden = spenden;
    }   
}
