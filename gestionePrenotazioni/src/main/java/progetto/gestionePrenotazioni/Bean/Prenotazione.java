package progetto.gestionePrenotazioni.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Utente utente;
    private Postazione postazione;
    private String data;

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public void setPostazione(Postazione postazione) {
        this.postazione = postazione;
    }

    public void setData(String data) {
        this.data = data;
    }
}
