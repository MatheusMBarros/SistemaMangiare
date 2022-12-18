package Exceptions;

public class ExecaoTamanhoPizza extends Exception {
    public ExecaoTamanhoPizza() {
        super("Insira um tamanho válido");
    }
}
