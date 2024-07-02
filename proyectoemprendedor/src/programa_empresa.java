
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisg
 */
public class programa_empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion ;
       
  JOptionPane.showMessageDialog(null,"BIENVENIDOS A INTERFRUITS PERÚ");

            String nombre=" " ;

          nombre =  JOptionPane.showInputDialog("NOMBRE DE USUARIO: ");

     
          

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU DE FRTUTA: "
                            
                    + "1.UVA,  "
                    + "2.MANGO,  "
                    + "3.LIMÓN,  "
                    + "4.PALTA,  "
                    + "5.BANANA ORGÁNICO,  "
                    + "6.MELÓN  "
                    + "ELIJA EL PRODUCTO QUE QUIERE ADQUIRIR."));

            switch (opcion) {

                case 1:
                    
                    int precioporCaja,
                     cantidad,
                     total;
                    precioporCaja = Integer.parseInt(JOptionPane.showInputDialog("INTRODUSCA EL PRECIO POR CAJA DE UVA: "));
                   

                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("INTRODUSCA PORFAVOR CLIENTE EL NUMERO DE CAJAS QUE QUIERE ADQUIRIR: "));
                    
                    total = precioporCaja * cantidad;

                   JOptionPane.showMessageDialog(null,"TOTAL A PAGAR -> " + (precioporCaja * cantidad));

                    JOptionPane.showMessageDialog(null,"GRACIAS POR TU COMPRA");
                    break;

               
                case 2:
                     precioporCaja = Integer.parseInt(JOptionPane.showInputDialog("INTRODUSCA EL PRECIO POR CAJA DE MANGO: "));
                   

                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("INTRODUSCA PORFAVOR CLIENTE EL NUMERO DE CAJAS QUE QUIERE ADQUIRIR: "));
                    
                    total = precioporCaja * cantidad;

                    JOptionPane.showMessageDialog(null,"TOTAL A PAGAR -> " + (precioporCaja * cantidad));

                    JOptionPane.showMessageDialog(null,"GRACIAS POR TU COMPRA");
                    break;
                case 3:
                     precioporCaja = Integer.parseInt(JOptionPane.showInputDialog("INTRODUSCA EL PRECIO POR CAJA DE LIMON: "));
                   

                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("INTRODUSCA PORFAVOR CLIENTE EL NUMERO DE CAJAS QUE QUIERE ADQUIRIR: "));
                    
                    total = precioporCaja * cantidad;

                     JOptionPane.showMessageDialog(null,"TOTAL A PAGAR -> " + (precioporCaja * cantidad));

                    JOptionPane.showMessageDialog(null,"GRACIAS POR TU COMPRA");
                    break;
                case 4:
                     precioporCaja = Integer.parseInt(JOptionPane.showInputDialog("INTRODUSCA EL PRECIO POR CAJA DE PALTA: "));
                   

                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("INTRODUSCA PORFAVOR CLIENTE EL NUMERO DE CAJAS QUE QUIERE ADQUIRIR: "));
                    
                    total = precioporCaja * cantidad;

                    JOptionPane.showMessageDialog(null,"TOTAL A PAGAR -> " + (precioporCaja * cantidad));

                    JOptionPane.showMessageDialog(null,"GRACIAS POR TU COMPRA");
                    break;
                case 5:
                     precioporCaja = Integer.parseInt(JOptionPane.showInputDialog("INTRODUSCA EL PRECIO POR CAJA DE BANANA ORGÁNICO: "));
                   

                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("INTRODUSCA PORFAVOR CLIENTE EL NUMERO DE CAJAS QUE QUIERE ADQUIRIR: "));
                    
                    total = precioporCaja * cantidad;

                     JOptionPane.showMessageDialog(null,"TOTAL A PAGAR -> " + (precioporCaja * cantidad));

                    JOptionPane.showMessageDialog(null,"GRACIAS POR TU COMPRA");
                    break;
                case 6:
             precioporCaja = Integer.parseInt(JOptionPane.showInputDialog("INTRODUSCA EL PRECIO POR CAJA DE Melón: "));
                   

                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("INTRODUSCA PORFAVOR CLIENTE EL NUMERO DE CAJAS QUE QUIERE ADQUIRIR: "));
                    
                    total = precioporCaja * cantidad;

                   JOptionPane.showMessageDialog(null,"TOTAL A PAGAR -> " + (precioporCaja * cantidad));

                    JOptionPane.showMessageDialog(null,"GRACIAS POR TU COMPRA");
                    break;
   default:
                    JOptionPane.showInputDialog("Los rangos son de 1 al 6");
            }
        }
}
        // TODO code application logic here
    
    

