package p4.t3;

public class IProg {
	
	public static void main(String[] args) {
		Calcul unCalcMult = new Calcul() {
			@Override
			public int calc(int a, int b) {
				return a*b;
			}
		};
		int resMult = unCalcMult.calc(4, 3);
		System.out.println(resMult);
		
		System.out.println(new Calcul() {
			@Override
			public int calc(int a, int b) {
				return a+b;
			}
		}.calc(4, 3));
	}
}
