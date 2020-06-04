
package mercadito;

/**
 *
 * @author moyportillo
 */
public class vehiculo extends persona{
    
    private double precio, impuestos, total, subtotal;
    private String modelo, color, vendedor;
    Integer cont=1;
    String [][] exclavo = new String [1][10];

    public vehiculo(String id, String nombre, String apellido, String modelo, String color, double precio, double impuestos, double subtotal, double total, String vendedor) {
        super(id, nombre, apellido);
        this.precio = precio;
        this.impuestos = impuestos;
        this.total = total;
        this.subtotal = subtotal;
        this.modelo = modelo;
        this.color = color;
        this.vendedor = vendedor;
    }
    
    public void capturar(){
        Integer n = this.cont-1;
        String [][] vector = new String [this.cont][10];
        
        if(this.cont == 1){
            vector[n][0] = this.getId();
            vector[n][1] = this.getNombre();
            vector[n][2] = this.getApellido();
            vector[n][3] = this.modelo;
            vector[n][4] = this.color;
            vector[n][5] = String.valueOf(this.precio);
            vector[n][6] = String.valueOf(this.impuestos);
            vector[n][7] = String.valueOf(this.subtotal);
            vector[n][8] = String.valueOf(this.total);
            vector[n][9] = this.vendedor;
            
            this.exclavo = vector;
        }else{
            for(int i=0; i<this.cont-1;i++){
                vector[i][0] = this.exclavo[i][0];
                vector[i][1] = this.exclavo[i][1];
                vector[i][2] = this.exclavo[i][2];
                vector[i][3] = this.exclavo[i][3];
                vector[i][4] = this.exclavo[i][4];
                vector[i][5] = this.exclavo[i][5];
                vector[i][6] = this.exclavo[i][6];
                vector[i][7] = this.exclavo[i][7];
                vector[i][8] = this.exclavo[i][8];
                vector[i][9] = this.exclavo[i][9];    
            }
            vector[n][0] = this.getId();
            vector[n][1] = this.getNombre();
            vector[n][2] = this.getApellido();
            vector[n][3] = this.modelo;
            vector[n][4] = this.color;
            vector[n][5] = String.valueOf(this.precio);
            vector[n][6] = String.valueOf(this.impuestos);
            vector[n][7] = String.valueOf(this.subtotal);
            vector[n][8] = String.valueOf(this.total);
            vector[n][9] = this.vendedor;
            
            this.exclavo = vector;
        }
        this.cont = this.cont+1;
    }
    
    
    public void mostrar(){
        System.out.println(this.getId() +"\n"+this.getNombre() + "\n"+this.getApellido()+"\n"+modelo + "\n"+color + "\n"+precio + "\n"+impuestos+"\n"+total);
    }

}
