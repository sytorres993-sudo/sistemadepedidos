public class SistemaPedidos {
    public static void main(String[] args) {
        PedidoOnline miPedido = new PedidoOnline("P-101", "Lucía", 250.0, "Calle Falsa 123");

        // ACCESO PÚBLICO: Sin problemas
        miPedido.mostrarResumen();
        miPedido.procesarEnvio();

        // ACCESO PRIVADO: Esto daría ERROR si lo intentas
        // miPedido.idPedido = "000"; // Error: idPedido tiene acceso privado en Pedido

        System.out.println("¡Sistema ejecutado con éxito!");
    }
}