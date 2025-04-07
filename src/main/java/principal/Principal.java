package principal;

import javax.swing.JOptionPane;
import model.Aluno;

/**
 *
 * @author Davi Wolff
 */
public class Principal {
    public static void main (String[]args){
        
        Aluno alun = new Aluno();
        
        alun.setNome(JOptionPane.showInputDialog("Insira o nome do aluno: "));
        alun.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1: ")));
        alun.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Insira a nota2: ")));
        alun.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Insira a nota3: ")));
        
        JOptionPane.showMessageDialog(null, alun.toString());
        
    }
}
