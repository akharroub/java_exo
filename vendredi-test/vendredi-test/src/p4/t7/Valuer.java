package p4.t7;

@FunctionalInterface
public interface Valuer<T> {
	int valuer(T e,T r);
	
	public static void main(String[] args) {
		// Valuer<String> longueurChaine = (e)->e.length();
//		Valuer<String> longueurChaine = String::length;
//		System.out.println(longueurChaine.valuer("CDA qsdfdsq"));
		
		
		
//		Valuer<String> longueurChaine = new Valuer<String>() {
//			@Override
//			public int valuer(String e) {
//				return e.length();
//			}
//		};
		
	}
}
