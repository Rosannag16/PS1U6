package progetto.gestionePrenotazioni.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progetto.gestionePrenotazioni.Bean.Postazione;
import progetto.gestionePrenotazioni.Bean.Prenotazione;
import progetto.gestionePrenotazioni.Bean.Utente;
import progetto.gestionePrenotazioni.Enums.TipoPostazione;
import progetto.gestionePrenotazioni.Repository.PostazioneRepository;
import progetto.gestionePrenotazioni.Repository.PrenotazioneRepository;
import progetto.gestionePrenotazioni.Repository.UtenteRepository;

import java.util.List;

@Service
public class PrenotazioneService {
    @Autowired
    private PostazioneRepository postazioneRepository;

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public List<Postazione> ricercaPostazioni(String tipo, String citta) {
        return postazioneRepository.findAll().stream()
                .filter(p -> p.getTipo(TipoPostazione.TIPO_POSTAZIONE).name().equalsIgnoreCase(tipo) && p.getEdificio().equals(citta))
                .toList();
    }

    public boolean prenotaPostazione(Utente utente, Postazione postazione, String data) {
        // Verifica se l'utente ha già una prenotazione per la stessa data
        boolean hasExistingBooking = prenotazioneRepository.findByUtenteAndData(utente, data).isPresent();
        if (hasExistingBooking) {
            return false; // L'utente ha già una prenotazione per questa data
        }

        // Crea una nuova prenotazione
        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setUtente(utente);
        prenotazione.setPostazione(postazione);
        prenotazione.setData(data);

        // Salva la prenotazione nel repository
        prenotazioneRepository.save(prenotazione);

        return true; // Prenotazione effettuata con successo
    }
}
