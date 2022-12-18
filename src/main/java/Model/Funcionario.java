/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


/**
 *
 * @author mathe
 */
public class Funcionario extends Pessoa {
    private String id;
    private String salario;
    private int pedidosRealizados = 0;
    private static int geradorId = 0;
;
    public Funcionario(String nome, String cpf, String telefone, String salario) {
        super(nome, cpf, telefone);
        this.salario = salario;
        int soma = geradorId++;
        this.id = "FUN" + soma;
    }

    public int getPedidosRealizados() {
        return this.pedidosRealizados;
    }

    public void PedidosRealizados() {
        ++this.pedidosRealizados;
    }


    public String toString() {
        String pessoa = " \nFuncionário: " +super.toString();
        return pessoa + "Salario = " + this.salario + "\n ID = " + this.id + "\n Pedidos realizados = " + this.getPedidosRealizados();
    }

 
}
