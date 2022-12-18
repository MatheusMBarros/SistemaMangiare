/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Funcionario;
import Repository.RepositoryFuncionario;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mathe
 */
public class FuncionarioDAO implements RepositoryFuncionario{
    
    public static Set <Funcionario> listaFuncionarios= new HashSet<>();


    public Set <Funcionario> buscarTodosFuncionarios(){
        return listaFuncionarios;
    };


    @Override
    public void addFuncionario(Funcionario f) {
        listaFuncionarios.add(f);

    }


    
    
}
