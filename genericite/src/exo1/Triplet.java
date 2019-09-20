package exo1;

public class Triplet<T> {

	private final T premier;
	private final T second;
	private final T troisieme;
	
	public Triplet(T p, T s, T t) {
		this.premier = p;
		this.second = s;
		this.troisieme = t;
	}
	
	public T getPremier() {
		return premier;
	}


	public T getSecond() {
		return second;
	}


	public T getTroisieme() {
		return troisieme;
	}


	
	public void affichage() {
		System.out.println(" ==> premier : ("+premier+") ,second : ("+second+") ,troisieme : ("+troisieme+")");
	}
	


}
