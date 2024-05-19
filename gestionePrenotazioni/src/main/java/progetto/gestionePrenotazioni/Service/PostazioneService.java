package progetto.gestionePrenotazioni.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progetto.gestionePrenotazioni.Bean.Postazione;
import progetto.gestionePrenotazioni.Repository.PostazioneRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostazioneService {
    @Autowired
    private PostazioneRepository postazioneRepository;

    public List<Postazione> getAllPostazioni() {
        return postazioneRepository.findAll();
    }

    public Optional<Postazione> getPostazioneByCodice(String codice) {
        return postazioneRepository.findByCodice(codice);
    }

    public void addPostazione(Postazione postazione) {
        postazioneRepository.save(postazione);
    }
}
