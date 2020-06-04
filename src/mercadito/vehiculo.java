
package mercadito;

import javax.swing.JOptionPane;

/**
 *
 * @author moyportillo
 */
public class vehiculo extends persona{
    
    private double precio, impuestos, total, subtotal;
    private String modelo, color, vendedor;
    static Integer cont=1;
    public static String [][] exclavo = new String [1][10];
    
    public vehiculo(){
        
    }
    
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
        Integer n = cont-1;
        String [][] vector = new String [cont][10];
        
        if(cont == 1){
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
            
            exclavo = vector;
        }else{
            for(int i=0; i<cont-1;i++){
                vector[i][0] = exclavo[i][0];
                vector[i][1] = exclavo[i][1];
                vector[i][2] = exclavo[i][2];
                vector[i][3] = exclavo[i][3];
                vector[i][4] = exclavo[i][4];
                vector[i][5] = exclavo[i][5];
                vector[i][6] = exclavo[i][6];
                vector[i][7] = exclavo[i][7];
                vector[i][8] = exclavo[i][8];
                vector[i][9] = exclavo[i][9];    
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
            
            exclavo = vector;
        }
        cont = cont+1; 
        this.mostrar();
    }
    
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "*** Datos de Factura **\nIdentidad: "+this.id+"\nNombre Cliente: "+this.nombre+" "+this.apellido+"\n-- Detalle de Compra --\nModelo vehiculo: "
        +this.modelo+"\nColor: "+this.color+"\nPrecio: "+this.precio+"\nImpuestos: "+this.impuestos+"%\nSubtotal: "+this.subtotal+"\n**TOTAL: "+this.total+"**");    
    }
    
    public void lista(){
        System.out.println("Lista de Compras de Vehiculo\n");
        for(int i=0; i<cont-1; i++){
            System.out.println("Factura # "+(i+1));
            System.out.println("ID: "+ exclavo[i][0]);
            System.out.println("Cliente: "+exclavo[i][1]+" "+exclavo[i][2]);
            System.out.println("Vendedor: "+exclavo[i][9]);
            System.out.println("---Detalles de Factura---");
            System.out.println("Modelo: "+exclavo[i][3]);
            System.out.println("Color: "+exclavo[i][4]);
            System.out.println("Precio: "+exclavo[i][5]);
            System.out.println("Impuestos: "+exclavo[i][6]);
            System.out.println("Subtotal: "+exclavo[i][7]);
            System.out.println("***TOTAL: "+exclavo[i][8]);
            System.out.println("-------------------------------------------");
        }
    }
    

}
