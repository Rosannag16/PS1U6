package progetto.gestionePrenotazioni.Bean;

import lombok.Data;

@Data
public class Utente {
    private String username;
    private String nomeCompleto;
    private String email;

    // Metodi getter per gli attributi
    public String getUsername() {
        return username;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    // Metodi setter per gli attributi
    public void setUsername(String username) {
        this.username = username;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
