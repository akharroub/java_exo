package exo2;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ecouteur extends MouseAdapter {

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("appui "+((Fenetre)(e.getSource())).getTitle()+ " " +e.getX()+" "+e.getY());
		super.mousePressed(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("relachemment "+((Fenetre)(e.getSource())).getTitle()+" "+e.getX()+" "+e.getY());
		super.mouseReleased(e);
	}
}
