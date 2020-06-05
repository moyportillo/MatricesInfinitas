
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
    public static String [][] esclavo = new String [1][10];
    
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
            
            esclavo = vector;
        }else{
            for(int i=0; i<cont-1;i++){
                vector[i][0] = esclavo[i][0];
                vector[i][1] = esclavo[i][1];
                vector[i][2] = esclavo[i][2];
                vector[i][3] = esclavo[i][3];
                vector[i][4] = esclavo[i][4];
                vector[i][5] = esclavo[i][5];
                vector[i][6] = esclavo[i][6];
                vector[i][7] = esclavo[i][7];
                vector[i][8] = esclavo[i][8];
                vector[i][9] = esclavo[i][9];    
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
            
            esclavo = vector;
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
            System.out.println("ID: "+ esclavo[i][0]);
            System.out.println("Cliente: "+esclavo[i][1]+" "+esclavo[i][2]);
            System.out.println("Vendedor: "+esclavo[i][9]);
            System.out.println("---Detalles de Factura---");
            System.out.println("Modelo: "+esclavo[i][3]);
            System.out.println("Color: "+esclavo[i][4]);
            System.out.println("Precio: "+esclavo[i][5]);
            System.out.println("Impuestos: "+esclavo[i][6]);
            System.out.println("Subtotal: "+esclavo[i][7]);
            System.out.println("***TOTAL: "+esclavo[i][8]);
            System.out.println("-------------------------------------------");
        }
        
    }
    
    public void Ordenamiento(){
        
        String [][] temp = new String[cont-2][10];
        String [][] ordenamiento = new String [cont][10];
        ordenamiento = esclavo;
        
        for(int i=0; i<cont-2; i++){
            for(int j=0; j<cont-2; j++){
                if(Double.parseDouble(ordenamiento[i][5]) < Double.parseDouble(ordenamiento[j+1][5])){
                    temp[i][0] = ordenamiento[j+1][0];
                    temp[i][1] = ordenamiento[j+1][1];
                    temp[i][2] = ordenamiento[j+1][2];
                    temp[i][3] = ordenamiento[j+1][3];
                    temp[i][4] = ordenamiento[j+1][4];
                    temp[i][5] = ordenamiento[j+1][5];
                    temp[i][6] = ordenamiento[j+1][6];
                    temp[i][7] = ordenamiento[j+1][7];
                    temp[i][8] = ordenamiento[j+1][8];
                    temp[i][9] = ordenamiento[j+1][9];
                    ordenamiento[j+1][0] = ordenamiento[j][0];
                    ordenamiento[j+1][1] = ordenamiento[j][1];
                    ordenamiento[j+1][2] = ordenamiento[j][2];
                    ordenamiento[j+1][3] = ordenamiento[j][3];
                    ordenamiento[j+1][4] = ordenamiento[j][4];
                    ordenamiento[j+1][5] = ordenamiento[j][5];
                    ordenamiento[j+1][6] = ordenamiento[j][6];
                    ordenamiento[j+1][7] = ordenamiento[j][7];
                    ordenamiento[j+1][8] = ordenamiento[j][8];
                    ordenamiento[j+1][9] = ordenamiento[j][9];
                    ordenamiento[j][0] = temp[i][0];
                    ordenamiento[j][1] = temp[i][1];
                    ordenamiento[j][2] = temp[i][2];
                    ordenamiento[j][3] = temp[i][3];
                    ordenamiento[j][4] = temp[i][4];
                    ordenamiento[j][5] = temp[i][5];
                    ordenamiento[j][6] = temp[i][6];
                    ordenamiento[j][7] = temp[i][7];
                    ordenamiento[j][8] = temp[i][8];
                    ordenamiento[j][9] = temp[i][9];
                }
            }
        }
        System.out.println("Lista ordenada de Compras de Vehiculo\n");
        for(int i=0; i<cont-1; i++){
            System.out.println("Factura # "+(i+1));
            System.out.println("ID: "+ ordenamiento[i][0]);
            System.out.println("Cliente: "+ordenamiento[i][1]+" "+ordenamiento[i][2]);
            System.out.println("Vendedor: "+ordenamiento[i][9]);
            System.out.println("---Detalles de Factura---");
            System.out.println("Modelo: "+ordenamiento[i][3]);
            System.out.println("Color: "+ordenamiento[i][4]);
            System.out.println("Precio: "+ordenamiento[i][5]);
            System.out.println("Impuestos: "+ordenamiento[i][6]);
            System.out.println("Subtotal: "+ordenamiento[i][7]);
            System.out.println("***TOTAL: "+ordenamiento[i][8]);
            System.out.println("-------------------------------------------");
        }
    }

}
