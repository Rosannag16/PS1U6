package progetto.gestionePrenotazioni.Repository;


import org.springframework.stereotype.Repository;
import progetto.gestionePrenotazioni.Bean.Postazione;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PostazioneRepository {
    private List<Postazione> postazioni = new ArrayList<>();

    public List<Postazione> findAll() {
        return postazioni;
    }

    public Optional<Postazione> findByCodice(String codice) {
        return postazioni.stream().filter(p -> p.getCodice().equals(codice)).findFirst();
    }

    public void save(Postazione postazione) {
        postazioni.add(postazione);
    }
}
