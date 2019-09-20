package prod;
public abstract class Volaille {
    protected double poids;
    protected final int cpt;
    private static int ID=0;
    protected double poidsmax=0;
    
    public double getPoids() {
        return poids;
    }
    public void setPoids(double poids) {
        this.poids = poids;
    }
    public Volaille(double poids) {
        
        this.poids = poids;
        cpt=ID++;
    }
	@Override
	public String toString() {
		return "ID = " +cpt+ " poids = " + poids  ;
	}
	public int getCpt() {
		return cpt;
	}
	public double getPoidsmax() {
		return poidsmax;
	}
	public void setPoidsmax(double poidsmax) {
		this.poidsmax = poidsmax;
	}
	
}
