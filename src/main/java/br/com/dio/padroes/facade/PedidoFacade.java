package br.com.dio.padroes.facade;

import br.com.dio.padroes.model.Pedido;
import br.com.dio.padroes.service.EstoqueService;
import br.com.dio.padroes.service.PagamentoService;
import br.com.dio.padroes.strategy.DescontoStrategy;

public class PedidoFacade {
    private final EstoqueService estoqueService;
    private final PagamentoService pagamentoService;

    public PedidoFacade() {
        this.estoqueService = new EstoqueService();
        this.pagamentoService = new PagamentoService();
    }

    public void finalizarPedido(Pedido pedido, DescontoStrategy descontoStrategy) {
        System.out.println("=== Finalizando pedido ===");
        System.out.println("Produto: " + pedido.produto());

        if (!estoqueService.reservar(pedido)) {
            System.out.println("Não foi possível reservar o estoque.");
            return;
        }

        double valorOriginal = pedido.calcularTotal();
        double valorFinal = descontoStrategy.aplicarDesconto(valorOriginal);

        System.out.printf("Valor original: R$ %.2f%n", valorOriginal);
        System.out.printf("Valor após desconto: R$ %.2f%n", valorFinal);

        pagamentoService.pagar(valorFinal);
        System.out.println("Pedido finalizado com sucesso!");
        System.out.println();
    }
}
