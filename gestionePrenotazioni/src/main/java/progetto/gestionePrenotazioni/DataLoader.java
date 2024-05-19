package progetto.gestionePrenotazioni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import progetto.gestionePrenotazioni.Bean.Edificio;
import progetto.gestionePrenotazioni.Bean.Postazione;
import progetto.gestionePrenotazioni.Bean.Utente;
import progetto.gestionePrenotazioni.Enums.TipoPostazione;
import progetto.gestionePrenotazioni.Repository.EdificioRepository;
import progetto.gestionePrenotazioni.Repository.PostazioneRepository;
import progetto.gestionePrenotazioni.Repository.UtenteRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EdificioRepository edificioRepository;

    @Autowired
    private PostazioneRepository postazioneRepository;

    @Autowired
    private UtenteRepository utenteRepository;

    @Override
    public void run(String... args) throws Exception {
        Edificio edificio1 = new Edificio();
        edificio1.setNome("Edificio 1");
        edificio1.setIndirizzo("Via Roma, 1");
        edificio1.setCitta("Roma");

        Edificio edificio2 = new Edificio();
        edificio2.setNome("Edificio 2");
        edificio2.setIndirizzo("Via Milano, 2");
        edificio2.setCitta("Milano");

        edificioRepository.save(edificio1);
        edificioRepository.save(edificio2);

        Postazione postazione1 = new Postazione();
        postazione1.setCodice("P001");
        postazione1.setDescrizione("Postazione Privata");
        postazione1.setTipo(TipoPostazione.PRIVATO);
        postazione1.setNumeroMassimoOccupanti(1);
        postazione1.setEdificio(edificio1);

        Postazione postazione2 = new Postazione();
        postazione2.setCodice("P002");
        postazione2.setDescrizione("Sala Riunioni");
        postazione2.setTipo(TipoPostazione.SALA_RIUNIONI);
        postazione2.setNumeroMassimoOccupanti(10);
        postazione2.setEdificio(edificio2);

        postazioneRepository.save(postazione1);
        postazioneRepository.save(postazione2);

        Utente utente1 = new Utente();
        utente1.setUsername("user1");
        utente1.setNomeCompleto("Mario Rossi");
        utente1.setEmail("mario.rossi@example.com");

        Utente utente2 = new Utente();
        utente2.setUsername("user2");
        utente2.setNomeCompleto("Luca Bianchi");
        utente2.setEmail("luca.bianchi@example.com");

        utenteRepository.save(utente1);
        utenteRepository.save(utente2);
    }
}
