package controle;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.modeloCliente;
import modelo.modeloFuncionario;



public class ConexaoBD {
    public final String fonte = "jdbc:mysql://localhost/sistema";
    public final String driver = "com.mysql.jdbc.Driver";
    public final String usuario = "root";
    public final String senha = "";
    public Connection con;
    public PreparedStatement stm;
    public ResultSet rs;
   
    public void conexao(){
        try{
            System.setProperty("jdbc.Driver", driver);//seta a propriedade do driver
            con = DriverManager.getConnection(fonte,usuario,senha);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de Conexão!\n Erro: " + ex.getMessage());
        }
    }
    
    public void CadastrarFuncionario(modeloFuncionario funcionario) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement (" INSERT INTO " + 
            "funcionario (nome, datadenascimento, rg, orgao, cpf, email, telefone, cep, uf, cidade, bairro, rua, numero, complemento) " +
            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
    this.stm.setString (1, funcionario.getNome());
    this.stm.setString (2, funcionario.getDatadenascimento());
    this.stm.setString(3,funcionario.getRg());
    this.stm.setString(4,funcionario.getOrgao());
    this.stm.setString(5,funcionario.getCpf());
    this.stm.setString(6,funcionario.getEmail());
    this.stm.setString(7,funcionario.getTelefone());
    this.stm.setString(8,funcionario.getCep());
    this.stm.setString(9,funcionario.getUf());
    this.stm.setString(10,funcionario.getCidade());
    this.stm.setString(11,funcionario.getBairro());
    this.stm.setString(12,funcionario.getRua());
    this.stm.setString(13,funcionario.getNumero());
    this.stm.setString(14,funcionario.getComplemento());
    this.stm.execute();
    this.stm.close();
}//fimprocedimentoCadastrarCliente  
public modeloFuncionario ProcurarFuncionario(int id) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement ("SELECT * FROM funcionario " + 
            "WHERE id = ?");
    this.stm.setInt(1, id);
    ResultSet rs = this.stm.executeQuery();
    modeloFuncionario funcionario = new modeloFuncionario();
        while(rs.next()){
            funcionario.setId(rs.getInt("id"));
            funcionario.setNome(rs.getString("nome"));
            funcionario.setDatadenascimento(rs.getString("datadenascimento"));
            funcionario.setRg(rs.getString("rg"));
            funcionario.setOrgao(rs.getString("orgao"));
            funcionario.setCpf(rs.getString("cpf"));
            funcionario.setEmail(rs.getString("email"));
            funcionario.setTelefone(rs.getString("telefone"));
            funcionario.setCep(rs.getString("cep"));
            funcionario.setCidade(rs.getString("cidade"));
            funcionario.setBairro(rs.getString("bairro"));
            funcionario.setRua(rs.getString("rua"));
            funcionario.setNumero(rs.getString("numero"));
            funcionario.setComplemento(rs.getString("complemento"));
        }     
        this.con.close();
        return funcionario;
}//fimfunçãoProcurarCliente
public void AtualizarFuncionario(modeloFuncionario funcionario, int id) throws SQLException{
     this.con = DriverManager.getConnection(fonte, this.usuario, this.senha); 
    this.stm = this.con.prepareStatement("UPDATE funcionario SET nome = ?, " +
    "datadenascimento = ?, rg = ?, orgao = ?, cpf = ?, email = ?, telefone = ?,"+
    "cep = ?, uf = ?, cidade = ?, bairro = ?, rua = ?, numero = ?, complemento = ? WHERE id = ?");
        this.stm.setString (1, funcionario.getNome());
        this.stm.setString (2, funcionario.getDatadenascimento());
        this.stm.setString (3, funcionario.getRg());
        this.stm.setString (4, funcionario.getOrgao());
        this.stm.setString (5, funcionario.getCpf());
        this.stm.setString (6, funcionario.getEmail()); 
        this.stm.setString (7, funcionario.getTelefone()); 
        this.stm.setString (8, funcionario.getCep()); 
        this.stm.setString (9, funcionario.getUf()); 
        this.stm.setString (10, funcionario.getCidade());
        this.stm.setString (11, funcionario.getBairro());
        this.stm.setString (12, funcionario.getRua());
        this.stm.setString (13, funcionario.getNumero());
        this.stm.setString (14, funcionario.getComplemento());
           
           
        this.stm.setInt (15, id);
        this.stm.execute();
        this.stm.close();
}   
    public void RemoverFuncionario(int id) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement("DELETE FROM funcionario WHERE id = ?");
    this.stm.setInt(1, id);
    this.stm.execute();
    this.con.close();
    
    }
    public void CadastrarCliente(modeloCliente cliente) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement (" INSERT INTO " + 
            "cliente (nome, datadenascimento, rg, orgao, cpf, email, telefone, cep, uf, cidade, bairro, rua, numero, complemento) " +
            "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
    this.stm.setString (1, cliente.getNome());
    this.stm.setString (2, cliente.getDatadenascimento());
    this.stm.setString(3, cliente.getRg());
    this.stm.setString(4, cliente.getOrgao());
    this.stm.setString(5, cliente.getCpf());
    this.stm.setString(6, cliente.getEmail());
    this.stm.setString(7, cliente.getTelefone());
    this.stm.setString(8, cliente.getCep());
    this.stm.setString(9, cliente.getUf());
    this.stm.setString(10, cliente.getCidade());
    this.stm.setString(11, cliente.getBairro());
    this.stm.setString(12, cliente.getRua());
    this.stm.setString(13, cliente.getNumero());
    this.stm.setString(14, cliente.getComplemento());
    this.stm.execute();
    this.stm.close();
}//fimprocedimentoCadastrarCliente  
public modeloCliente ProcurarCliente(int id) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement ("SELECT * FROM cliente " + 
            "WHERE id = ?");
    this.stm.setInt(1, id);
    ResultSet rs = this.stm.executeQuery();
    modeloCliente cliente = new modeloCliente();
        while(rs.next()){
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setDatadenascimento(rs.getString("datadenascimento"));
            cliente.setRg(rs.getString("rg"));
            cliente.setOrgao(rs.getString("orgao"));
            cliente.setCpf(rs.getString("cpf"));
            cliente.setEmail(rs.getString("email"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setCep(rs.getString("cep"));
            cliente.setUf(rs.getString("uf"));
            cliente.setCidade(rs.getString("cidade"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setRua(rs.getString("rua"));
            cliente.setNumero(rs.getString("numero"));
            cliente.setComplemento(rs.getString("complemento"));
        }     
        this.con.close();
        return cliente;
}//fimfunçãoProcurarCliente
public void AtualizarCliente(modeloCliente cliente, int id) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha); 
    this.stm = this.con.prepareStatement("UPDATE cliente SET nome = ?, " +
    "datadenascimento = ?, rg = ?, orgao = ?, cpf = ?, email = ?, telefone = ?,"+
    "cep = ?, uf = ?, cidade = ?, bairro = ?, rua = ?, numero = ?, complemento = ? WHERE id = ?");
        this.stm.setString (1, cliente.getNome());
        this.stm.setString (2, cliente.getDatadenascimento());
        this.stm.setString (3, cliente.getRg());
        this.stm.setString (4, cliente.getOrgao());
        this.stm.setString (5, cliente.getCpf());
        this.stm.setString (6, cliente.getEmail()); 
        this.stm.setString (7, cliente.getTelefone()); 
        this.stm.setString (8, cliente.getCep()); 
        this.stm.setString (9, cliente.getUf()); 
        this.stm.setString (10, cliente.getCidade());
        this.stm.setString (11, cliente.getBairro());
        this.stm.setString (12, cliente.getRua());
        this.stm.setString (13, cliente.getNumero());
        this.stm.setString (14, cliente.getComplemento());
           
           
        this.stm.setInt (15, id);
        this.stm.execute();
        this.stm.close();
}   
    public void RemoverCliente(int id) throws SQLException{
    this.con = DriverManager.getConnection(fonte, this.usuario, this.senha);
    this.stm = this.con.prepareStatement("DELETE FROM cliente WHERE id = ?");
    this.stm.setInt(1, id);
    this.stm.execute();
    this.con.close();
}

}
