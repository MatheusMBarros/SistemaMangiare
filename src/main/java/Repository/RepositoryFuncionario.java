/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Funcionario;

import java.util.Set;

/**
 *
 * @author mathe
 */
public interface RepositoryFuncionario {
  
    void addFuncionario(Funcionario c);

    Set<Funcionario> buscarTodosFuncionarios();

}
