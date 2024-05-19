package progetto.gestionePrenotazioni.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import progetto.gestionePrenotazioni.Bean.*;
import progetto.gestionePrenotazioni.Enums.TipoPostazione;

@Configuration
public class AppConfig {

    @Bean
    public Edificio edificio() {
        Edificio edificio = new Edificio();
        edificio.setNome("Nome edificio");
        edificio.setIndirizzo("Indirizzo edificio");
        edificio.setCitta("Città edificio");
        return edificio;
    }

    @Bean
    public Postazione postazione() {
        Postazione postazione = new Postazione();
        postazione.setCodice("Codice postazione");
        postazione.setDescrizione("Descrizione postazione");
        postazione.getTipo(TipoPostazione.TIPO_POSTAZIONE);
        postazione.setNumeroMassimoOccupanti(5);
        postazione.setEdificio(edificio());
        return postazione;
    }

    @Bean
    public Prenotazione prenotazione() {
        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setUtente(utente());
        prenotazione.setPostazione(postazione());
        prenotazione.setData("Data prenotazione");
        return prenotazione;
    }

    @Bean
    public Utente utente() {
        Utente utente = new Utente();
        utente.setUsername("Username utente");
        utente.setNomeCompleto("Nome completo utente");
        utente.setEmail("Email utente");
        return utente;
    }
}
