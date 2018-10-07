
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalvarNoTXT {

    private String nome;
    private String email;
    private String senha;
    private String Id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String Id() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    public String salvar(){
        try{
            FileWriter fw = new FileWriter("cadastros.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome: "+this.nome);
            pw.println("Email: "+this.email);
            pw.println("Senha: "+this.senha);
            pw.println("ID: "+this.Id);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(SalvarNoTXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Cadastro com sucesso!";
    }
}
