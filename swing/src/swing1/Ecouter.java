package swing1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ecouter extends WindowAdapter{
@Override
public void windowClosing(WindowEvent e) {
	System.out.println("la fenetre est en cours de fermeture");
	super.windowClosing(e);
}
@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("la fenetre a ete ferm�e");
		super.windowClosed(e);
	}
@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("la fenetre a ete rendue visible");
		super.windowOpened(e);
	}
@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("la fenetre devient la fenetre active");
		super.windowActivated(e);
	}
@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("la fenetre est sur le point de devenir inactive");
		super.windowDeactivated(e);
	}
@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("la fenetre a ete agrendie");
		super.windowDeiconified(e);
	}


}
