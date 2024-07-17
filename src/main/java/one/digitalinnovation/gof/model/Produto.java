package one.digitalinnovation.gof.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String nomeProduto;
    private double valor;
    private String descricaoProduto;
    private String categoriaProduto;
    private String modeloProduto;
    @ManyToOne
    private Setor setor;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    public String getCategoriaProduto() {
        return categoriaProduto;
    }
    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }
    public String getModeloProduto() {
        return modeloProduto;
    }
    public void setModeloProduto(String modeloProduto) {
        this.modeloProduto = modeloProduto;
    }
    public Setor getSetor() {
        return setor;
    }
    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    
}
