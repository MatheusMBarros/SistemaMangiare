/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;



/**
 *
 * @author mathe
 */
public class Cliente extends Pessoa {

    private String endereco;


    public Cliente(String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone);
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nCliente: " + super.toString() + "Endereço = " + endereco ;
    }

}
