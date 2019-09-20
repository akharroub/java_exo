package swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
	public Fenetre() {
		super("titre de l'application");
		WindowListener l = new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		};


		
		addWindowListener(l);
	
		setSize(200,100);

		setVisible(true);
	
	}


	
	public static void main(String [] args){
	
		JFrame frame = new Fenetre();
	
	}
	
}