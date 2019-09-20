package p2;

public interface I2 extends I1 {
	void m1();
	
	public static void mI() {
		for(int i = 0; i<10; i++) {
			System.out.println("coucou " + i);
		}
	}
	
	public static void main(String[] args) {
		mI();
		System.out.println("coucou");
	}
}
