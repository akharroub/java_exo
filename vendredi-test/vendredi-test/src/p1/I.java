package p1;

public interface I {
	void m();
	
	default void t() {
		System.out.println("par defaut");
	}
}
