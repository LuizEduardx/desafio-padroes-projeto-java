package br.com.dio.padroes.singleton;

public class ConfiguracaoSistema {
    private static final ConfiguracaoSistema INSTANCIA = new ConfiguracaoSistema();

    private final String nomeAplicacao;

    private ConfiguracaoSistema() {
        this.nomeAplicacao = "Sistema de Pedidos - Design Patterns";
    }

    public static ConfiguracaoSistema getInstancia() {
        return INSTANCIA;
    }

    public String getNomeAplicacao() {
        return nomeAplicacao;
    }
}
