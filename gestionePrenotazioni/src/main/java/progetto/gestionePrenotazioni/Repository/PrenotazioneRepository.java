package progetto.gestionePrenotazioni.Repository;

import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import progetto.gestionePrenotazioni.Bean.Prenotazione;
import progetto.gestionePrenotazioni.Bean.Utente;

import java.util.Optional;


@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    Optional<Prenotazione> findByUtenteAndData(Utente utente, String data);
}
