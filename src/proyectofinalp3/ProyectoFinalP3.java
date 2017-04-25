/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalp3;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Rafael
 */
public class ProyectoFinalP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int OPC = 0;
        boolean flag = true;
         do{
                OPC = SolicitarEntero ("Ingrese la opción deseada: \n"
                    + "1. Calcular Máximo Común Divisor \n"
                    + "2. Calcular Mínimo Común Divisor \n"
                    + "3. Salir ");
   
        switch(OPC){
           
        case 1:
        int a = SolicitarEntero("Escribe el primer número");
        int b = SolicitarEntero("Escribe el segundo número");
        int mayor = Math.max(a, b);
        int menor = Math.min(a, b);
        boolean band;
        
        do{
            int mod = mayor%menor; 
            if(mod == 0){
                JOptionPane.showMessageDialog(null, "El M.C.D. entre " + a + " y " + b + " es: \n" + menor); 
                band = false;    
            }
            else {
                mayor = menor;
                menor = mod;
                band = true;
            }                   
        }while(band);
        break;  
        
        case 2:
        a = SolicitarEntero("Primer número");
        b = SolicitarEntero("Segundo número");
        menor = Math.min(a, b);
        int mcm = 0;
        for (int i = 1; i <= menor; i++) {
            if (a % i == 0 && b % i == 0) {
                int mcd = i;
                mcm = (a*b)/mcd;
            }
        }
        JOptionPane.showMessageDialog(null, "El M.C.M. entre " + a + " y " + b + " es: \n" + mcm);
        flag = true;
        break;
        case 3:
            JOptionPane.showMessageDialog(null, "Adios!");
            flag = false;
            break;
        }
         }
         while(flag);
    }

        
        public static int SolicitarEntero (String men){
        int num = 0;
        boolean flag;
        do{
            try{
                String dato = JOptionPane.showInputDialog(men);
                num = Integer.parseInt(dato);
                flag = false;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error");
                flag=true;
            }
        }
        while(flag);
        return num;
    }
    
}
