
package mercadito;

import javax.swing.JOptionPane;


public class metodos {
    
    Integer cont = 1;
    private Integer opc = 0;
    String[][] verctor_esclavo = new String[1][8];
    
    
    public void menu(){
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU\n1.Agregar Nueva Factura\n2.Mostrar Facturas\n3.Buscar Factura\n4.Salir\nSeleccione una opcion: "));
        
        switch(opc){
            case 1:
                    ingreso();
                    break;
            case 2:
                    break;
            case 3:
                    break;
            default:
                    break;
        }
    }
    
    public void ingreso(){
        String id, nom,ape, model, color, vendedor;
        double precio, imp, total, subtotal;
            id =JOptionPane.showInputDialog(null, "Ingrese la identidad del cliente: ");
            nom = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente: ");
            ape =JOptionPane.showInputDialog(null, "Ingrese el apellido del cliente: ");
            model = JOptionPane.showInputDialog(null, "Ingrese el modelo del vehiculo: ");
            color = JOptionPane.showInputDialog(null, "Ingrese el color del vehiculo: ");
            precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del vehiculo: "));
            imp = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese los impuestos: "));
            subtotal = precio * (imp/100);
            total = precio + subtotal;
            vendedor = JOptionPane.showInputDialog(null, "Ingrese el nombre del Vendedor: ");
         
            vehiculo factura = new vehiculo(id, nom, ape, model, color, precio, imp, subtotal, total, vendedor);
            
            factura.mostrar();
    }
    
    
}
