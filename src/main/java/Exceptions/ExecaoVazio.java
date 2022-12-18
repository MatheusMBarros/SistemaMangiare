package Exceptions;

public class ExecaoVazio extends Exception {
    public ExecaoVazio() {
        super("Adicione no mínimo um item ao pedido");
    }
}
