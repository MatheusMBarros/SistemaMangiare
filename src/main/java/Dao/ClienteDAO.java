/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Repository.RepositoryCliente;
import Model.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mathe
 */
public class ClienteDAO implements RepositoryCliente {
     private static Set<Cliente> listaClientes = new HashSet<Cliente>();;

    
    @Override
    public void addCliente(Cliente c) {
        listaClientes.add(c);
    }

    @Override
    public Set<Cliente> buscarClientes() {
        return listaClientes;
    }


}
