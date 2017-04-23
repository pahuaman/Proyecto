/* @(#)Principal.java @author José Garfia @version 1.00 2017/4/2 */

 import java.awt.*;
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 
public class Frente extends JFrame{
     Fondo  Abarrotes;
     Opcion Otro;
     
    public Frente(){
    	super("Abarrotes Don Pancho");
    	setBounds(500,200,265,250);
    	//setBounds(200,200,500,265);
    	setVisible(true);
    	setResizable(false);
    	
    	Container contentpane = getContentPane();
    	contentpane.setLayout(new GridLayout(1,2));
    	
    	Abarrotes  = new Fondo();
        Otro       = new Opcion(); 
        
        contentpane.add(Abarrotes);
        contentpane.add(Otro); 
    	
    	paint(getGraphics());
    	
    }//constructor
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Frente      X = new Frente();
        Contrasenia C = new Contrasenia();
        C.mostrarMarco();
        
    }//main
}//class
