/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mathe
 */
public class Pizza {

    private String tamanho;
    private float preco;

    private String sabor1;

    private String sabor2;

    private String sabor3;

    private Menu m;


    public Pizza(String tamanho) {
        this.m = new Menu();
        this.tamanho = tamanho;
        this.preco = geradorPreco();
    }


    public String getTamanho() {
        return tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public float geradorPreco() {
        String tamanhoPizza = this.getTamanho().toLowerCase();
        return switch (tamanhoPizza) {
            case "p" ->
                35;
            case "m" ->
                40;
            case "g" ->
                45;
            case "gg"->
                50;
            default ->
                0;
        };
    }

    @Override
    public String toString() {
        StringBuilder sab = new StringBuilder();
        if (this.sabor1 != null) {
            sab.append(this.sabor1 + " / ");
        }
        if (this.sabor2 != null) {
            sab.append(this.sabor2 + " / ");
        }
        if (this.sabor3 != null) {
            sab.append(this.sabor3 + " / ");
        }
        String texto = "";
        texto = "Pizza:"
                + "tamanho= " + tamanho
                + ", preco = " + preco
                + " Sabor = " + sab.toString();

        return texto;
    }

}
