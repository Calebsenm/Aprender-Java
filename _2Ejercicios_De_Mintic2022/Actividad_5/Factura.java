public class Factura {
    
    int Cantidad;
    String Descripcion;
    float Precio;
    float Valor_Venta;

    public Factura(int Cantidad,String Descripcion, float Precio,float Valor_Venta){

        this.Cantidad = Cantidad;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Valor_Venta = Valor_Venta;
    }

    public void setCantidad(int Cantidad){
        this.Cantidad = Cantidad;
    }

    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }

    public void setPrecio(float Precio){
        this.Precio = Precio;
    }

    public void setDescripcion(float Valor_Venta){
        this.Valor_Venta = Valor_Venta;
    }

    // get
    public int getCantidad(){
        return Cantidad;
    }

    public String getDescripcion(){
        return Descripcion;
    }

    public float getPrecio(){
        return Precio;
    }

    public float getValor_Venta(){
        return Valor_Venta;
    }




}
