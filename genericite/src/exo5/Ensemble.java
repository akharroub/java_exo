package exo5;

import java.util.ArrayList;
import java.util.List;

public class Ensemble<T> {

	private final List<T> liste;

	public Ensemble() {
		liste = new ArrayList<>();
	}

	public boolean ajouter(T element) {
		if (this.liste.contains(element)) {
			return false;
		} else {
			liste.add(element);
			return true;
		}
	}

	public boolean remove(T element) {
		if (this.liste.contains(element)) {
			liste.remove(element);
			return true;
		} else {
			return false;
		}
	}

	public void afficher() {
		if (this.liste.isEmpty()) {
			System.out.println("la liste et vide;");
		} else {
			for (T t : liste) {
				System.out.println(t);
			}
		}
	}

	@Override
	public String toString() {
		return "Ensemble [liste=" + liste.size() + "]";
	}
}
