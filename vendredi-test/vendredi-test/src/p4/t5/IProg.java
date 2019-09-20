package p4.t5;

public class IProg {

	public static void main(String[] args) {
		Calcul<Integer> unCalcMult = (x, y) -> x / y;
		System.out.println(unCalcMult.calc(12, 2));

		Calcul<String> concat = (c, d) -> {
			return c + d;
		};
		System.out.println(concat.calc("41", "3"));
		
		Calcul<Boolean> leOu = (a,b)->a||b;
		System.out.println(leOu.calc(true, true));
		System.out.println(leOu.calc(false, true));
		System.out.println(leOu.calc(false, false));
	}
}
