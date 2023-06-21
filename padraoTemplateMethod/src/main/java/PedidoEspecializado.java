
public class PedidoEspecializado extends Pedido {
    @Override
    public void calcularValorTotal() {
        // Implemente a lógica específica para calcular o valor total de um pedido especializado
        // Por exemplo, para um pedido especializado, o valor total pode ser fixo em 10.0f
        this.valorTotal = 10.0f;
    }

    @Override
    public String getTipo() {
        return "Pedido Especializado";
    }
}

