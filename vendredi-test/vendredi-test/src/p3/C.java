package p3;

public class C implements I1, I2 {
	@Override
	public void m() {
		I2.super.m();
		I1.super.m();
		System.out.println("C");
		I2.super.m();
	}
	
	public static void main(String[] args) {
		C unC = new C();
		unC.m();
	}
}
