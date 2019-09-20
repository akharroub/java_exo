package exo1;

public class TripletH<T,U,V> {
	
	private final T premier;
	private final U second;
	private final V troisieme;
	
	
	
	public TripletH(T premier, U second, V troisieme) {
		
		this.premier = premier;
		this.second = second;
		this.troisieme = troisieme;
	}


	public T getPremier() {
		return premier;
	}


	public U getSecond() {
		return second;
	}


	public V getTroisieme() {
		return troisieme;
	}


	
	public void affichage() {
		System.out.println(" ==> premier : ("+premier+") ,second : ("+second+") ,troisieme : ("+troisieme+")");
	}
	

	

}
