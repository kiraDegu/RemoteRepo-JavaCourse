package ListAndMap_Rubrica.src;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RubricaMap implements IRubrica {
    Map<String, Contatto> rubricaMap = new HashMap<>();

    @Override
    public void aggiungiContatto(String nome, String cognome, List<NumeroTelefono> numeroTList) throws Exception {

    }

    @Override
    public void aggiungiContatto(String nome, String cognome, List<NumeroTelefono> numeroTList, String via, String citta, String cap, String provincia) throws Exception {

    }

    @Override
    public void rimuoviContatto(String idContatto) {

    }

    @Override
    public void cercaContattoPerNome(String nome) {

    }

    @Override
    public void cercaContattoPerCognome(String cognome) {

    }

    @Override
    public void cercaContattoPerNumero(String numero) {

    }

    @Override
    public void visualizzaRubrica() {

    }

    @Override
    public void cercaContatto(String input) {

    }

    @Override
    public void visualizzaSoloContattiEstesi() {

    }

    @Override
    public int size() {
        return 0;
    }
}