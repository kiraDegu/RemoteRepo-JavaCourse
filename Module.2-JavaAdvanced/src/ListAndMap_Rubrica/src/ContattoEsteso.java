package ListAndMap_Rubrica.src;

import java.util.List;

public class ContattoEsteso extends Contatto{
    private String via;
    private String citta;
    private String cap;
    private String provincia;

    public ContattoEsteso(String id, String nome, String cognome, List<NumeroTelefono> numeroTList, String via, String citta, String cap, String provincia) {
        super(id, nome, cognome, numeroTList);
        this.via = via;
        this.citta = citta;
        this.cap = cap;
        this.provincia = provincia;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    @Override
    public String toString() {
        return
                "id = " + super.getId() +
                        ", nome= " + super.getNome()  +
                        ", cognome= " + super.getCognome()  +
                        ", indirizzo = " + via + ", " + citta + ", " + provincia + ", " + cap + "\n" +
                        stampaNum();
    }
}