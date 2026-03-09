public class Pedido {
    // PRIVATE: Nadie fuera de esta clase puede cambiar el ID directamente
    private String idPedido;

    // PROTECTED: Las clases hijas (como PedidoOnline) podrán usar estos campos
    protected String cliente;
    protected double monto;

    public Pedido(String idPedido, String cliente, double monto) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.monto = monto;
    }

    // PUBLIC: Queremos que cualquiera pueda consultar el resumen del pedido
    public void mostrarResumen() {
        System.out.println("Pedido [" + idPedido + "] para: " + cliente + " | Total: $" + monto);
    }
}