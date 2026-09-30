package br.com.dio.padroes;

import br.com.dio.padroes.facade.PedidoFacade;
import br.com.dio.padroes.model.Pedido;
import br.com.dio.padroes.singleton.ConfiguracaoSistema;
import br.com.dio.padroes.strategy.DescontoPrimeiraCompra;
import br.com.dio.padroes.strategy.DescontoVip;
import br.com.dio.padroes.strategy.SemDesconto;

public class App {
    public static void main(String[] args) {
        ConfiguracaoSistema configuracao = ConfiguracaoSistema.getInstancia();
        System.out.println("Sistema: " + configuracao.getNomeAplicacao());
        System.out.println();

        PedidoFacade facade = new PedidoFacade();

        Pedido pedido1 = new Pedido("Teclado Mecânico", 1, 250.00);
        facade.finalizarPedido(pedido1, new SemDesconto());

        Pedido pedido2 = new Pedido("Mouse Gamer", 2, 150.00);
        facade.finalizarPedido(pedido2, new DescontoVip());

        Pedido pedido3 = new Pedido("Headset", 1, 400.00);
        facade.finalizarPedido(pedido3, new DescontoPrimeiraCompra());
    }
}
