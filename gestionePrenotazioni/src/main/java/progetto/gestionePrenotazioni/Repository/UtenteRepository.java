package progetto.gestionePrenotazioni.Repository;

import org.springframework.stereotype.Repository;
import progetto.gestionePrenotazioni.Bean.Utente;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UtenteRepository {
    private List<Utente> utenti = new ArrayList<>();

    public List<Utente> findAll() {
        return utenti;
    }

    public void save(Utente utente) {
        utenti.add(utente);
    }
}
