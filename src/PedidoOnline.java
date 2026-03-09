public class PedidoOnline extends Pedido {
    private String direccionEnvio;

    public PedidoOnline(String idPedido, String cliente, double monto, String direccion) {
        super(idPedido, cliente, monto);
        this.direccionEnvio = direccion;
    }

    public void procesarEnvio() {
        // Podemos usar 'cliente' directamente porque es PROTECTED en el padre
        System.out.println("Enviando el paquete de " + cliente + " a la dirección: " + direccionEnvio);
    }
}