/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Exceptions.Execao;
import Exceptions.ExecaoLimitePedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author mathe
 */
public class Pedido {

    private Funcionario f;
    private Cliente c;
    private List<Pizza> itensDoPedido;
    private  static  int tamanho = 0;
    private final Date dataHoraAtual = new Date();

    private String metodoDePagamento;

    public Pedido(Funcionario f, Cliente c, String metodoDePagamento) {
        this.f = f;
        f.PedidosRealizados();
        this.c = c;
        this.metodoDePagamento = metodoDePagamento;
        itensDoPedido =  new ArrayList<Pizza>();
    }

    public List<Pizza> getItensDoPedido() {
        return itensDoPedido;
    }

    public void addItems(Pizza p) throws ExecaoLimitePedido {
            if (tamanho <= 10) {
                itensDoPedido.add(p);
                tamanho++;
            } else {
                throw new ExecaoLimitePedido();
            }
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
                String texto
                = "\nPedido:"
                + "Funcionario = " + f.getNome()
                + "\n Cliente = " + c.getNome()
                + "\n Horario = " + dataHoraAtual
                + "\n Método de pagamento:" + metodoDePagamento
                + " \n Items-> ";

                 return texto;
    }
}
