# Desafio de Projeto — Padrões de Projeto com Java

Projeto desenvolvido para praticar Design Patterns em Java.

- Padrões utilizados:

- Singleton:
A classe `ConfiguracaoSistema` possui uma única instância compartilhada pela aplicação.

- Strategy:
O cálculo de desconto é feito por estratégias diferentes
- `SemDesconto`
- `DescontoVip`
- `DescontoPrimeiraCompra`

- Facade:
A classe `PedidoFacade` simplifica o processo de finalização de um pedido. Ela coordena estoque, desconto e pagamento através de uma única interface.

- Estrutura:
```text
src/main/java/br/com/dio/padroes
App.java
-facade/PedidoFacade.java
-model/Pedido.java
-service/EstoqueService.java
-service/PagamentoService.java
-singleton/ConfiguracaoSistema.java
-strategy/
    -DescontoStrategy.java
    -DescontoPrimeiraCompra.java
    -DescontoVip.java
    -SemDesconto.java
```

- Como executar:
Abra o projeto em uma IDE Java e execute `br.com.dio.padroes.App`.

- Objetivo:
Demonstrar na prática como padrões de projeto ajudam a reduzir acoplamento, organizar responsabilidades e facilitar a evolução do código.
