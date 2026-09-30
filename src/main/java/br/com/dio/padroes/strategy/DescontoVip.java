package br.com.dio.padroes.strategy;

public class DescontoVip implements DescontoStrategy {
    private static final double PERCENTUAL = 0.10;

    @Override
    public double aplicarDesconto(double valor) {
        return valor * (1 - PERCENTUAL);
    }
}
