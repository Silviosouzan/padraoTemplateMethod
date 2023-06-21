public class PedidoPadrao extends Pedido {
    @Override
    public void calcularValorTotal() {
        // Implemente a lógica específica para calcular o valor total de um pedido padrão
        // Por exemplo, para um pedido padrão, o valor total pode ser 0.0f ou calculado com base em algum critério
        this.valorTotal = 0.0f;
    }

    @Override
    public String getTipo() {
        return "Pedido Padrão";
    }
}