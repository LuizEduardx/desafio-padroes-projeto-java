package br.com.dio.padroes.strategy;

public class DescontoPrimeiraCompra implements DescontoStrategy {
    private static final double PERCENTUAL = 0.15;

    @Override
    public double aplicarDesconto(double valor) {
        return valor * (1 - PERCENTUAL);
    }
}
