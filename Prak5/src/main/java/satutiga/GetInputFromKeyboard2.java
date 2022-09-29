/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package satutiga;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class GetInputFromKeyboard2 {
    public static void main(String args[]) {
        String name ="", hoby ="";
        
        name = JOptionPane.showInputDialog("Nama Anda : ");
        name = JOptionPane.showInputDialog("Hobi Anda : ");
        
        String msg = "Jadi Hobi Anda "+hoby+". "
                + "Hobi yang bagus "+name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi Hobi Anda "+hoby+". hobi yang bagus" + name);
    }
}
