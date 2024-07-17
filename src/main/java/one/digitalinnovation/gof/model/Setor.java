package one.digitalinnovation.gof.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Setor {

    @Id
    private String nomeSetor;
    private String descricaoSetor;
    private String nomeGerenteSetor;

    public String getNomeSetor() {
        return nomeSetor;
    }
    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
    public String getDescricaoSetor() {
        return descricaoSetor;
    }
    public void setDescricaoSetor(String descricaoSetor) {
        this.descricaoSetor = descricaoSetor;
    }
    public String getNomeGerenteSetor() {
        return nomeGerenteSetor;
    }
    public void setNomeGerenteSetor(String nomeGerenteSetor) {
        this.nomeGerenteSetor = nomeGerenteSetor;
    }
    
}
