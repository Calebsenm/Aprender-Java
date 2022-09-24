import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Caleb", 17);
        Producto producto = new Producto(10, "Papas");
        ArrayList producto1 = new ArrayList();
        producto1.add("pan");
        producto1.add("panes");
        producto1.add("queso");

        Factura factura = new Factura(30, "pa", 100, 2000, producto1);
        while (true) {
            System.out.print("\033[H\033[2J");
            factura.printCount();
            factura.AgregarProducto();
            factura.EditarProducto();
            System.out.print("\033[H\033[2J");
            factura.printCount();
            factura.RemoverProducto();

        }

    }
}