package Exceptions;

public class ExecaoLimitePedido extends Exception {
    public ExecaoLimitePedido() {
        super("Limite de 10 pizzas por pedido");
    }
}
