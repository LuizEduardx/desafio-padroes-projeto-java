package br.com.dio.padroes.service;

import br.com.dio.padroes.model.Pedido;

public class EstoqueService {
    public boolean reservar(Pedido pedido) {
        System.out.println("Estoque: " + pedido.quantidade()
                + " unidade(s) de " + pedido.produto() + " reservada(s).");
        return true;
    }
}
