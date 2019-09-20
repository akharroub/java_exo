package ferma;

public abstract class Volaille {

	private double poids;
	protected final int numIdent;
	private static int ID=0;
	protected double poidsmax=0;
	
	public double getPoidsmax() {
		return poidsmax;
	}

	public void setPoidsmax(double poidsmax) {
		this.poidsmax = poidsmax;
	}

	/**
	 * @param poids
	 * @param numIdent
	 */
	public Volaille(double poids) {
		super();
		this.poids = poids;
		this.numIdent = ID++;
	}

	@Override
	public String toString() {
		return "Volaille [poids=" + poids + ", numIdent=" + numIdent + "]";
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public int getNumIdent() {
		return numIdent;
	}
	
	

}
