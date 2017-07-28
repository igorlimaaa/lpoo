package modelo;


public class modeloFuncionario extends modeloPessoa {
    
    public modeloFuncionario(int id, String nome, String datadenascimento, String rg, String orgao, String cpf, String email, String telefone, String cep, String uf, String cidade, String bairro, String rua, String numero, String complemento) {
        this.id = id;
        this.nome = nome;
        this.datadenascimento = datadenascimento;
        this.rg = rg;
        this.orgao = orgao;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
     
    }

    public modeloFuncionario(String nome, String datadenascimento, String rg, String orgao, String cpf, String email, String telefone, String cep, String uf, String cidade, String bairro, String rua, String numero, String complemento) {
        this.nome = nome;
        this.datadenascimento = datadenascimento;
        this.rg = rg;
        this.orgao = orgao;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.uf = uf;
    }
    public modeloFuncionario(int id, String nome, String datadenascimento) {
        this.id = id;
        this.nome = nome;
        this.datadenascimento = datadenascimento;
    }

    public modeloFuncionario(int id) {
        this.id = id;
    }

    public modeloFuncionario(String nome, String datadenascimento) {
        this.nome = nome;
        this.datadenascimento = datadenascimento;
    }

    public modeloFuncionario() {
    }

}
