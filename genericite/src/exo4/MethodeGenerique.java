package exo4;

public class MethodeGenerique {

	public static <E extends Comparable<E>> E maxVall( E[] elements) {
		E max = elements[0];
		for (E e : elements) {
			if (e.compareTo(max) > 0) {
				max = e;
			}
		}
		return max;

	}
}


