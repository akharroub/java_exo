package exo3;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Programme extends JFrame{

	public Programme(){
		
		setSize(1280, 1024);
		setTitle("Test");
		setContentPane(new AfficheImage("C:\\tigre.jpg"));
		getContentPane().setLayout(new BorderLayout());
		this.setVisible(true);
	}
}

