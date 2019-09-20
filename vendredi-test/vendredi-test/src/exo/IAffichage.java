package exo;

public interface IAffichage {
//	public Boolean Iaffichage(Integer b);
	
	public static boolean pair(Integer a) {
		return a % 2== 0;
	}
	
	public static boolean positif(Integer a) {
		return a > 0;
	}
	
	public static boolean negatif(Integer a) {
		return a < 0;
	}
}
