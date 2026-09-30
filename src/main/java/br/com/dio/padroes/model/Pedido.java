package br.com.dio.padroes.model;

public record Pedido(String produto, int quantidade, double valorUnitario) {
    public double calcularTotal() {
        return quantidade * valorUnitario;
    }
}
