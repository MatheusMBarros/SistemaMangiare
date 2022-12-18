/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;
import Model.Cliente;

import java.util.Set;

/**
 *
 * @author mathe
 */
public interface RepositoryCliente{
    void addCliente(Cliente c);
    Set <Cliente>buscarClientes();
}