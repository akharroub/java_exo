package exo1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Programme extends JFrame {
	public Programme() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(20,30,40,300);
//		addMouseListener(this);
	}



	public static void main(String[] args) {

//		Ecouteur ecouteur = new Ecouteur();
		Programme fenetre = new Programme();


		fenetre.setVisible(true);
		fenetre.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("appui "+e.getX()+" "+e.getY());

			}
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("relachemment "+e.getX()+" "+e.getY());
			}
		});

	}





}
