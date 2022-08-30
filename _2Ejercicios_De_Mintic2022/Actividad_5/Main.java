
public class Main{
    public static void main(String[] args) {
        

        
        Cliente cliente = new Cliente("Caleb", 17);
        Producto producto = new Producto(10, "Papas");
        Factura factura = new Factura(22, "Pan con queso", 2, 123);


        System.out.println(cliente.Edad);
        System.out.println(producto.Nombre);
        System.out.println(factura.Cantidad);
    }
}