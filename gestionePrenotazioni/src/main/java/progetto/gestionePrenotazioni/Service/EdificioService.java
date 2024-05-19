package progetto.gestionePrenotazioni.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progetto.gestionePrenotazioni.Bean.Edificio;
import progetto.gestionePrenotazioni.Repository.EdificioRepository;

import java.util.List;

@Service
public class EdificioService {
    @Autowired
    private EdificioRepository edificioRepository;

    public List<Edificio> getAllEdifici() {
        return edificioRepository.findAll();
    }

    public void addEdificio(Edificio edificio) {
        edificioRepository.save(edificio);
    }
}
