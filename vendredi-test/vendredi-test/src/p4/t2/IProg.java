package p4.t2;

public class IProg {
	
	public static void main(String[] args) {
		
		class Addition implements Calcul {
			@Override
			public int calc(int a, int b) {
				return a+b;
			}
		}
		
		Calcul unCalcAdd = new Addition();
		int resAdd = unCalcAdd.calc(4, 3);
		System.out.println(resAdd);
		
		class Multiplication implements Calcul {
			@Override
			public int calc(int a, int b) {
				return a*b;
			}
		}
		
		Calcul unCalcMult = new Multiplication();
		int resMult = unCalcMult.calc(4, 3);
		System.out.println(resMult);
	}

	
}
