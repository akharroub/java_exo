package p4.t5;

@FunctionalInterface
public interface Calcul<T> {
	T calc(T a, T b);
	
	default void same(T a,T b) {
		System.out.println("");
	}
}
