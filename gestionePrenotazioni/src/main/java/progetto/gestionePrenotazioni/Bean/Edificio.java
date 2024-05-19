package progetto.gestionePrenotazioni.Bean;

import jakarta.persistence.Entity;
import lombok.Data;

@Data

public class Edificio {
    private String nome;
    private String indirizzo;
    private String citta;

    public void setNome(String nomeEdificio) {
    }

    public void setIndirizzo(String indirizzoEdificio) {
    }

    public void setCitta(String cittàEdificio) {

    }
}
