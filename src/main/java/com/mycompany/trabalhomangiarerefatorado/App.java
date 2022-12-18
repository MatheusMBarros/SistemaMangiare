/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabalhomangiarerefatorado;

import Controler.ControlerTelaInicial;
import View.TelaInicial;

/**
 *
 * @author mathe
 */
public class App {
    public static void main(String[] args) {
        ControlerTelaInicial controlerTelaInicial = new ControlerTelaInicial(new TelaInicial());
        controlerTelaInicial.exibirTela();

    }
}
