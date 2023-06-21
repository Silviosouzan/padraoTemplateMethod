import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoEspecializadoTest {

    @Test
    void deveCalcularValorTotalDoPedidoEspecializado() {
        Pedido pedido = new PedidoEspecializado();
        pedido.setNomeCliente("Marcelo");
        pedido.setEndereco("Rua ABC, 123");
        pedido.calcularValorTotal();
        assertEquals(10.0f, pedido.getValorTotal());
    }

    @Test
    void deveCalcularValorTotalDoPedidoPadrao() {
        Pedido pedido = new PedidoPadrao();
        pedido.setNomeCliente("Maria");
        pedido.setEndereco("Av. XYZ, 456");
        pedido.calcularValorTotal();
        assertEquals(0.0f, pedido.getValorTotal());
    }

    @Test
    void deveRetornarInformacoesDoPedidoEspecializado() {
        Pedido pedido = new PedidoEspecializado();
        pedido.setNomeCliente("Marcelo");
        pedido.setEndereco("Rua ABC, 123");
        pedido.calcularValorTotal();
        assertEquals("Pedido Especializado{nomeCliente='Marcelo', endereco='Rua ABC, 123', valorTotal=10.0}", pedido.getInfo());
    }

    @Test
    void deveRetornarInformacoesDoPedidoPadrao() {
        Pedido pedido = new PedidoPadrao();
        pedido.setNomeCliente("Maria");
        pedido.setEndereco("Av. XYZ, 456");
        pedido.calcularValorTotal();
        assertEquals("Pedido Padrão{nomeCliente='Maria', endereco='Av. XYZ, 456', valorTotal=0.0}", pedido.getInfo());
    }
}

