package br.com.dio.padroes.service;

public class PagamentoService {
    public void pagar(double valor) {
        System.out.printf("Pagamento aprovado: R$ %.2f%n", valor);
    }
}
