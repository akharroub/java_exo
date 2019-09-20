package p4.t1;

public class IProg {
		
	public static void main(String[] args) {
		Calcul unCalcAdd = new Addition();
		int resAdd = unCalcAdd.calc(4, 3);
		System.out.println(resAdd);
		
		Calcul unCalcMult = new Multiplication();
		int resMult = unCalcMult.calc(4, 3);
		System.out.println(resMult);
	}
}
