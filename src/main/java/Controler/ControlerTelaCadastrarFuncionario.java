/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Dao.FuncionarioDAO;
import Exceptions.Execao;
import Model.Funcionario;
import Repository.RepositoryFuncionario;
import View.TelaCadastrarFuncionario;

/**
 *
 * @author mathe
 */
public class ControlerTelaCadastrarFuncionario {
    private TelaCadastrarFuncionario telaCadastrarFuncionario;
    private  Funcionario funcionario;

    public ControlerTelaCadastrarFuncionario(TelaCadastrarFuncionario telaCadastrarFuncionario, Funcionario funcionario) {
        this.telaCadastrarFuncionario = telaCadastrarFuncionario;
        this.funcionario = funcionario;
        iniciarBotao();

    }
    public void iniciarBotao(){
        telaCadastrarFuncionario.criarCadastro(e -> {
            try {
                criarCadastroFuncionario();
            } catch (Execao ex) {
                telaCadastrarFuncionario.exibirMensagem(ex.getMessage());
            }
        });
    }
 
 public void criarCadastroFuncionario() throws Execao {

if(telaCadastrarFuncionario.getCpfFuncionario().isEmpty() || telaCadastrarFuncionario.getNomeFuncionario().isEmpty() || telaCadastrarFuncionario.getTelefoneFuncionario().isEmpty() || telaCadastrarFuncionario.getSalarioFuncionario().isEmpty()){
    throw new Execao();
}else {
    String nome = telaCadastrarFuncionario.getNomeFuncionario();
    String cpf = telaCadastrarFuncionario.getCpfFuncionario();
    String telefone = telaCadastrarFuncionario.getTelefoneFuncionario();
    String salario = telaCadastrarFuncionario.getSalarioFuncionario();
    Funcionario fun = new Funcionario(nome, cpf, telefone, salario);
    RepositoryFuncionario repositoryFuncionario = new FuncionarioDAO();
    repositoryFuncionario.addFuncionario(fun);
    telaCadastrarFuncionario.exibirMensagem("Funcionario cadastrado com sucesso" + fun.toString());
    telaCadastrarFuncionario.limparTela();
}
 }


    public void exibirTela() {
        telaCadastrarFuncionario.exibirTela();
    }
}
