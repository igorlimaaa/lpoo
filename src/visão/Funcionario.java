package visão;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "funcionario", catalog = "sistema", schema = "")
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findById", query = "SELECT f FROM Funcionario f WHERE f.id = :id"),
    @NamedQuery(name = "Funcionario.findByNome", query = "SELECT f FROM Funcionario f WHERE f.nome = :nome"),
    @NamedQuery(name = "Funcionario.findByDatadenascimento", query = "SELECT f FROM Funcionario f WHERE f.datadenascimento = :datadenascimento"),
    @NamedQuery(name = "Funcionario.findByRg", query = "SELECT f FROM Funcionario f WHERE f.rg = :rg"),
    @NamedQuery(name = "Funcionario.findByOrgao", query = "SELECT f FROM Funcionario f WHERE f.orgao = :orgao"),
    @NamedQuery(name = "Funcionario.findByCpf", query = "SELECT f FROM Funcionario f WHERE f.cpf = :cpf"),
    @NamedQuery(name = "Funcionario.findByEmail", query = "SELECT f FROM Funcionario f WHERE f.email = :email"),
    @NamedQuery(name = "Funcionario.findByTelefone", query = "SELECT f FROM Funcionario f WHERE f.telefone = :telefone"),
    @NamedQuery(name = "Funcionario.findByCep", query = "SELECT f FROM Funcionario f WHERE f.cep = :cep"),
    @NamedQuery(name = "Funcionario.findByCidade", query = "SELECT f FROM Funcionario f WHERE f.cidade = :cidade"),
    @NamedQuery(name = "Funcionario.findByBairro", query = "SELECT f FROM Funcionario f WHERE f.bairro = :bairro"),
    @NamedQuery(name = "Funcionario.findByRua", query = "SELECT f FROM Funcionario f WHERE f.rua = :rua"),
    @NamedQuery(name = "Funcionario.findByNumero", query = "SELECT f FROM Funcionario f WHERE f.numero = :numero"),
    @NamedQuery(name = "Funcionario.findByComplemento", query = "SELECT f FROM Funcionario f WHERE f.complemento = :complemento")})
public class Funcionario implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "datadenascimento")
    private String datadenascimento;
    @Column(name = "rg")
    private String rg;
    @Column(name = "orgao")
    private String orgao;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "email")
    private String email;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "cep")
    private String cep;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "rua")
    private String rua;
    @Column(name = "numero")
    private String numero;
    @Column(name = "complemento")
    private String complemento;

    public Funcionario() {
    }

    public Funcionario(Integer id) {
        this.id = id;
    }

    public Funcionario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        String oldDatadenascimento = this.datadenascimento;
        this.datadenascimento = datadenascimento;
        changeSupport.firePropertyChange("datadenascimento", oldDatadenascimento, datadenascimento);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        String oldOrgao = this.orgao;
        this.orgao = orgao;
        changeSupport.firePropertyChange("orgao", oldOrgao, orgao);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        changeSupport.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        String oldRua = this.rua;
        this.rua = rua;
        changeSupport.firePropertyChange("rua", oldRua, rua);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        changeSupport.firePropertyChange("complemento", oldComplemento, complemento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "vis\u00e3o.Funcionario[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
