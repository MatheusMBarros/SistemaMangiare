/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Dao.ClienteDAO;
import Exceptions.Execao;
import Model.Cliente;
import Repository.RepositoryCliente;
import View.TelaCadastrarCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mathe
 */
public class ControlerTelaCadastrarCliente {
  private  TelaCadastrarCliente telaCadastrarCliente;
  private  Cliente cliente;

    public ControlerTelaCadastrarCliente(TelaCadastrarCliente telaCadastrarCliente , Cliente cliente) {
        this.telaCadastrarCliente = telaCadastrarCliente;
        this.cliente = cliente;
        inicializarAcaoBotoes();
    }

    public void inicializarAcaoBotoes(){
        telaCadastrarCliente.adicionarAcaoBotoes(e ->{
            try {
                criarCadastroCliente();
            } catch (Execao ex) {
                telaCadastrarCliente.messagemCadastro(ex.getMessage());
            }
        });
    }
    
    public void limparTela(){
        telaCadastrarCliente.limparTela();
    }
    
   public void criarCadastroCliente() throws Execao {
        if(telaCadastrarCliente.getCpfCliente().isEmpty() || telaCadastrarCliente.getEnderecoCliente().isEmpty() || telaCadastrarCliente.getNomeCliente().isEmpty() || telaCadastrarCliente.getTelefoneCliente().isEmpty()){
            throw new Execao();
        }else {
            RepositoryCliente repositoryCliente = new ClienteDAO();
            String nomeCliente = telaCadastrarCliente.getNomeCliente();
            String telefone = telaCadastrarCliente.getTelefoneCliente();
            String cpf = telaCadastrarCliente.getCpfCliente();
            String endereco = telaCadastrarCliente.getEnderecoCliente();
            Cliente cliente = new Cliente(nomeCliente, telefone, cpf, endereco);
            repositoryCliente.addCliente(cliente);
            telaCadastrarCliente.messagemCadastro("Cliente cadastrado" + cliente.toString());
            limparTela();
        }
   }

    public void exibirTela() {
        telaCadastrarCliente.exibirTela();
    }
}
