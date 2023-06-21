public abstract class Pedido {
    protected String nomeCliente;
    protected String endereco;
    protected float valorTotal;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public abstract void calcularValorTotal();

    public abstract String getTipo();

    public String getInfo() {
        return getTipo() + "{" +
                "nomeCliente='" + this.nomeCliente + '\'' +
                ", endereco='" + this.endereco + '\'' +
                ", valorTotal=" + this.valorTotal +
                '}';
    }
}