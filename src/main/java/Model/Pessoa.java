
package Model;

/**
 *
 * @author mathe
 */
public abstract class Pessoa {

    protected String nome;
    protected String cpf;
    protected String telefone;

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }
    
     public String toString() {
        return "Nome = '" + this.nome + "'\n Cpf = '" + this.cpf + "'\n Telefone = '" + this.telefone + "'\n ";
    }

}
