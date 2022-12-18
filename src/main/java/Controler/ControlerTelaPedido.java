/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Dao.ClienteDAO;
import Dao.FuncionarioDAO;
import Exceptions.*;
import Model.*;
import View.TelaPedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author mathe
 */
public class ControlerTelaPedido {
   private TelaPedido telaPedido;
    private Set <Funcionario> funcionarios;
    private Set <Cliente> clientes;
    private Pedido pedido;
    private  Menu menu;

    private  double soma = 0;

    public ControlerTelaPedido(TelaPedido telaPedido, Set<Funcionario> funcionarios, Set<Cliente> clientes, Pedido pedido , Menu menu) {
        this.telaPedido = telaPedido;
        this.funcionarios = funcionarios;
        this.clientes = clientes;
        this.pedido = pedido;
        this.menu = menu;
        inicializarBotoes();
    }
    //verificar os modelos
    public void exibirTela() {
        telaPedido.exibirTela();
    }
    public void inicializarBotoes(){
        telaPedido.adicionarAcaoBotaoAddItem(e->{
            try {
                adicionarItemPedido();
            } catch (Execao | ExecaoTamanhoPizza ex) {
                telaPedido.mensagem(ex.getMessage());
            }

        });
        telaPedido.adicionarAcaoFinalizarPedido(e->{
            try {
                finalizarPedido();
            } catch (ExecaoVazio ex) {
               telaPedido.mensagem(ex.getMessage());
            }

        });
    }

    private void finalizarPedido() throws ExecaoVazio {
        if(telaPedido.retornarTela().isEmpty()){
            throw new ExecaoVazio();
        }
     telaPedido.pedidoFinalizado(pedido.toString() +"\n" +telaPedido.retornarTela() +"\n" + "Valor total: R$" +soma );
        telaPedido.limparTela();
    }



    public void popularTela(){
        ClienteDAO cd = new ClienteDAO();
        FuncionarioDAO fd = new FuncionarioDAO();
        Menu menu = new Menu();
        Menu menu2 = new Menu();
        Menu menu3 = new Menu();
        clientes = cd.buscarClientes();
        funcionarios = fd.buscarTodosFuncionarios();
        telaPedido.popularCbClientes(clientes);
        telaPedido.popularCbFuncionario(funcionarios);
        telaPedido.popularCbSabor1(menu);
        telaPedido.popularCbSabor2(menu2);
        telaPedido.popularCbSabor3(menu3);
    }



    public void adicionarItemPedido() throws Execao, ExecaoTamanhoPizza {
        if(telaPedido.getMetodoPagamento().isEmpty() || telaPedido.getTamanho().isEmpty()){
            throw new Execao();
        }else {
            String tamanho = null;
            if(telaPedido.getTamanho().equalsIgnoreCase("p") || telaPedido.getTamanho().equalsIgnoreCase("m") || telaPedido.getTamanho().equalsIgnoreCase("g")|| telaPedido.getTamanho().equalsIgnoreCase("gg") ){
            tamanho = telaPedido.getTamanho();
            }else {
                throw new ExecaoTamanhoPizza();
            }
            Funcionario f = telaPedido.getFuncionario();
            Cliente c = telaPedido.getCliente();
            String metodoPagamento = telaPedido.getMetodoPagamento();
            Pedido pedido = new Pedido(f, c, metodoPagamento);
            Pizza p = new Pizza(tamanho);
            List <Pizza> itensDoPedido = pedido.getItensDoPedido();
            try {
                pedido.addItems(p);
            } catch (ExecaoLimitePedido e) {
                telaPedido.mensagem(e.getMessage());
            }
             if (pedido.getTamanho() <= 10) {
                 this.pedido = pedido;
                 String sabor1 = null;
                 try {
                     sabor1 = telaPedido.getSabor1();
                     String sabor2 = telaPedido.getSabor2();
                     String sabor3 = telaPedido.getSabor3();
                     soma = soma + p.getPreco();
                     telaPedido.popularLista(itensDoPedido);
                     telaPedido.saborEscolido(sabor1, sabor2, sabor3);
                 } catch (ExecaoSabor e) {
                     telaPedido.mensagem(e.getMessage());
                 }

             }
        }
    }
}
