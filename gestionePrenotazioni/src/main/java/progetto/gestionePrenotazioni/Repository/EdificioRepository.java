package progetto.gestionePrenotazioni.Repository;



import org.springframework.stereotype.Repository;
import progetto.gestionePrenotazioni.Bean.Edificio;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EdificioRepository {
    private List<Edificio> edifici = new ArrayList<>();

    public List<Edificio> findAll() {
        return edifici;
    }

    public void save(Edificio edificio) {
        edifici.add(edificio);
    }
}
