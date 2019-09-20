package p4.t4;

public class IProg {

	public static void main(String[] args) {
		Calcul unCalcMult = (x, y) -> x / y;
		System.out.println(unCalcMult.calc(12, 2));

		Calcul unCalcAdd = (c, d) -> {
			System.out.println("coucou j'appelle une methode");
			return c + d;
		};
		System.out.println(unCalcAdd.calc(41, 3));
	}
}
