package Controler;

import Dao.FuncionarioDAO;
import Model.Funcionario;
import Repository.RepositoryFuncionario;
import View.TelaListarFuncionarios;

import java.util.Set;

public class ControlerTelaListarFuncionarios {
   private TelaListarFuncionarios telaListarFuncionarios;
   private Set <Funcionario> funcionarios;

   public ControlerTelaListarFuncionarios(TelaListarFuncionarios telaListarFuncionarios, Set <Funcionario> funcionarios) {
      this.telaListarFuncionarios = telaListarFuncionarios;
      this.funcionarios = funcionarios;

   }
   public void listarFuncionarios(){
      RepositoryFuncionario funcionarioRepository = new FuncionarioDAO();
      funcionarios = funcionarioRepository.buscarTodosFuncionarios();
      telaListarFuncionarios.popularTelaFuncionarios(funcionarios);
   }

   public void exibirTela() {
      telaListarFuncionarios.exibirTela();
   }
}

