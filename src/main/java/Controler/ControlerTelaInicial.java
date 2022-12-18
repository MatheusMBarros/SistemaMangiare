
package Controler;

import Model.Menu;
import View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlerTelaInicial {
  private TelaInicial telaInicial;
    public ControlerTelaInicial(TelaInicial telaInicial) {
        this.telaInicial = telaInicial;
        inicializarBotoes();
    }

    public void inicializarBotoes(){
        telaInicial.adicionarAcaoBotaoCadastrarFuincionario(e -> {
            trocarTelaCadastrarFuncionario();
        });

        telaInicial.adicionarAcaoBotaoCadastrarCliente(e -> {
            trocarTelaCadastrarCliente();
        });

        telaInicial.adicionarBotaoListarFuncionarios(e -> {
            trocarTelaListarFuncionarios();
        });
        telaInicial.adicionarBotaoListarClientes(e ->{
            trocarTelaListarClientes();
        });

        telaInicial.adicionarAcaoRealizarPedido(e ->{
            trocarTelaRealizarPedido();

        });
    }



        public void trocarTelaCadastrarFuncionario(){
            ControlerTelaCadastrarFuncionario controlerTelaCadastrarFuncionario = new ControlerTelaCadastrarFuncionario(new TelaCadastrarFuncionario(),null);
            controlerTelaCadastrarFuncionario.exibirTela();
        }
        public void trocarTelaCadastrarCliente(){
            ControlerTelaCadastrarCliente controlerTelaCadastrarCliente = new ControlerTelaCadastrarCliente(new TelaCadastrarCliente(), null);
            controlerTelaCadastrarCliente.exibirTela();
        }
        public void trocarTelaListarFuncionarios(){
        ControlerTelaListarFuncionarios controlerTelaListarFuncionarios = new ControlerTelaListarFuncionarios(new TelaListarFuncionarios(),null);
            controlerTelaListarFuncionarios.listarFuncionarios();
            controlerTelaListarFuncionarios.exibirTela();
        }

        public void trocarTelaListarClientes(){
        ControlerTelaListarClientes controlerTelaListarClientes = new ControlerTelaListarClientes(new TelaListarClientes(),null);
        controlerTelaListarClientes.listarClientes();
        controlerTelaListarClientes.exibirTela();
        }

        public void trocarTelaRealizarPedido(){
        ControlerTelaPedido controlerTelaPedido = new ControlerTelaPedido(new TelaPedido(),null,null,null,null);
            controlerTelaPedido.exibirTela();
        controlerTelaPedido.popularTela();

        }

        public void exibirTela(){
        telaInicial.setVisible(true);
        }
}
