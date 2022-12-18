/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;

/**
 *
 * @author mathe
 */
public final class Menu {

    private HashMap<Integer, String> menu;

    public Menu() {
        this.menu = new HashMap<Integer, String>();
        addSabor();
    }

    public void addSabor() {
        menu.put(0,null);
        menu.put(1, "Calabresa");
        menu.put(2, "Frango Catupery");
        menu.put(3, "Vegetariana");
        menu.put(4, "Brocolis");
        menu.put(5, "Chocolate");
        menu.put(6, "Maguerita");
        menu.put(7, "Rúcula");
        menu.put(8, "Chocolate Branco");
        menu.put(9,"Milho");
        menu.put(10,"Strogonoff de Frango");
    }

    public HashMap<Integer, String> getMenu() {
        return menu;
    }

    private String sab;
    public String buscarSabor(int i) {
        menu.forEach((key, value) -> {
            sab = menu.get(i);
        });
        return sab;
    }

}
