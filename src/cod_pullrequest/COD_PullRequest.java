package cod_pullrequest;

import javax.swing.JOptionPane;

public class COD_PullRequest {

    public static void main(String[] args) {
        String saludo = JOptionPane.showInputDialog(null, 
            "Hoooola!! Que tal??", 
            JOptionPane.QUESTION_MESSAGE);
        
        if (saludo.equals("Bien")){
            JOptionPane.showInputDialog(null, "¡Me alegro mucho de que estés bien!");
        } else {
            JOptionPane.showInputDialog(null, "¡Oh! Qué dramón");
        }
        
    }
    
}
