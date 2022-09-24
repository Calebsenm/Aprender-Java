import java.util.ArrayList;
import java.util.Scanner;

public class Factura {

    int Cantidad;
    String Descripcion;
    float Precio;
    float Valor_Venta;
    Scanner io = new Scanner(System.in);
    Cliente cliente;
    ArrayList Producto_1;

    public Factura(int Cantidad, String Descripcion, float Precio, float Valor_Venta, ArrayList Producto_1) {

        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Valor_Venta = Valor_Venta;
        this.Producto_1 = Producto_1;

    }

    //
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public void setDescripcion(float Valor_Venta) {
        this.Valor_Venta = Valor_Venta;
    }

    public void AgregarProducto() {
        
        System.out.print("Ingresa un producto -> ");
        String P = io.nextLine();
        this.Producto_1.add(P);
    }

    public void RemoverProducto() {
        System.out.print("Ingresa el nombre del producto que deseas remover -> ");
        String Pp = io.nextLine();

        for (int i = 0; i < Producto_1.size(); i++) {

            String dato = (String) Producto_1.get(i);
            if(Pp.equals(dato)) {
                System.out.println(Producto_1.get(i) + " Ha sido removido correctamente");
                Producto_1.remove(i);
            }
        }
    }

    public void EditarProducto() {
        System.out.print("Ingresa un El producto que quiere  modificar -> ");
        String P = io.nextLine();

        for (int i = 0; i < Producto_1.size(); i++) {

            String pro = (String) Producto_1.get(i); 
            if (P.equals(pro)) {
                System.out.print("Ingresa un El nuevo producto -> ");
                String U = io.nextLine();
                // this replace the element of the list
                Producto_1.set(i,U);
            }
        }

    }

    // this if for print the count

    public void printCount() {
        // System.out.println("Este dato pertenese a " + cliente );
        for (int i = 0; i < Producto_1.size(); i++) {
            System.out.println(Producto_1.get(i));
        }
    }

    // get
    public int getCantidad() {
        return Cantidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public float getPrecio() {
        return Precio;
    }

    public float getValor_Venta() {
        return Valor_Venta;
    }

}
