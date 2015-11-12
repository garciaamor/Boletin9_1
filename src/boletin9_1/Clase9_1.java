package boletin9_1;

import javax.swing.JOptionPane;

public class Clase9_1 {
                   
        public  int ponerNumero(){
            
            return Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
                  
           }
        public void posneg(){
            int num;
            int j=0;
            int k=0;
            int g=0;
            for (int i=0;i<10;i++){
                num=ponerNumero();
            if (num>0)
                j++;
            else if (num<0)
                k++;
            else g++;
            
        }
        JOptionPane.showMessageDialog(null, "Numeros positivos : " + j + "\n Numeros negativos : " + k + "\n 0  :  " + g);
        }
}
