
package javaapplication2;

import javax.swing.JOptionPane;


public class ProjetoNota {

    
    public static void main(String[] args) {
      
        Notas nota = new Notas(); 
        
        
        nota.n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        nota.n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        nota.n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
        nota.n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));
        
        
        double media = (nota.n1 + nota.n2 + nota.n3 + nota.n4)/4;
        
         JOptionPane.showMessageDialog(null, String.format("A area do triangulo de X é:"+ media));
        
         
         if((nota.n1 > nota.n2)&& (nota.n1 > nota.n3) && (nota.n1 > nota.n4)){
            JOptionPane.showMessageDialog(null,"A maior nota é:" + (nota.n1));
         }
     if((nota.n2 > nota.n1)&& (nota.n2 > nota.n3) && (nota.n2 > nota.n4)){
            JOptionPane.showMessageDialog(null,"A maior nota é:" + (nota.n2));
        
    }
    
     if((nota.n3 > nota.n1)&& (nota.n3 > nota.n2) && (nota.n3 > nota.n4)){
            JOptionPane.showMessageDialog(null,"A maior nota é:" + (nota.n3));
        
    }
    
      if((nota.n4 > nota.n1)&& (nota.n4 > nota.n2) && (nota.n4 > nota.n3)){
            JOptionPane.showMessageDialog(null,"A maior nota é:" + (nota.n4));
        
    }
    }  
    
    
    
}
