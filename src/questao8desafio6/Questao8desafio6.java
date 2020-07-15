/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao8desafio6;

/**
 *
 * @author AliraMaria
 */
public class Questao8desafio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// 8-	Escrever um algoritmo que leia um valor X e calcule e 
//          mostre os 20 primeiros termos da série:
//		1	1	1	1	.....
//		X	X2	X3	X4
//
        
        int cont; String res = "Serie\n";
       double x, acSerie;
       acSerie=0;
        DecimalFormat f= new DecimalFormat("0.0");
       x = Double.parseDouble(JOptionPane.showInputDialog("Valor X:"));
       for(cont = 1; cont<=20; cont++){
           acSerie += 1.0/Math.pow(x,cont); 
           res += " "+(1.0/Math.pow(x,cont))+"\n"; 
       }//fim do loop
       JOptionPane.showMessageDialog(null, res);
       JOptionPane.showMessageDialog(null, "O resultado da série é: "
               +f.format(acSerie));
    }
    
}
