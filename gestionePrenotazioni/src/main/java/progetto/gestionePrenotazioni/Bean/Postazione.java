package progetto.gestionePrenotazioni.Bean;

import lombok.Data;
import progetto.gestionePrenotazioni.Enums.TipoPostazione;

@Data
public class Postazione {
    private String codice;
    private String descrizione;
    private TipoPostazione tipo;
    private int numeroMassimoOccupanti;
    private Edificio edificio;

    // Metodo getter per l'attributo 'tipo'
    public TipoPostazione getTipo(TipoPostazione tipoPostazione) {
        return tipo;
    }

    // Metodo getter per l'attributo 'edificio'
    public Edificio getEdificio() {
        return edificio;
    }

    // Metodi setter per gli attributi
    public void setCodice(String codice) {
        this.codice = codice;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setTipo(TipoPostazione tipo) {
        this.tipo = tipo;
    }

    public void setNumeroMassimoOccupanti(int numeroMassimoOccupanti) {
        this.numeroMassimoOccupanti = numeroMassimoOccupanti;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }
}
