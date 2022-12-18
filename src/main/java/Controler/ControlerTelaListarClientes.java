/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Dao.ClienteDAO;
import Model.Cliente;
import Repository.RepositoryCliente;
import View.TelaListarClientes;

import java.util.Set;

/**
 *
 * @author mathe
 */
public class ControlerTelaListarClientes {
    private   TelaListarClientes telaListarClientes;
    private   Set <Cliente> clientes;


     public ControlerTelaListarClientes( TelaListarClientes telaListarClientes,Set<Cliente> clientes) {
          this.telaListarClientes = telaListarClientes;
          this.clientes = clientes;
     }

     public void listarClientes(){
        RepositoryCliente  repositoryCliente = new ClienteDAO();
        clientes =  repositoryCliente.buscarClientes();
        telaListarClientes.popularTela(clientes);

     }

     public void exibirTela(){
          telaListarClientes.exibirTela();
     }
}
