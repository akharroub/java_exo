package p4.t6;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface IProducteur<T> {
	T produit();
	
	public static void main(String[] args) {
		IProducteur<Personne> pp = Personne::new;
		Personne p1 = pp.produit();
		System.out.println(p1);
		
		Supplier<Personne> pp2 = Personne::new;
		Personne p2 = pp2.get();
		System.out.println(p2);
		
		IProducteur<String> tp = p1::toString;
		System.out.println(tp.produit());
		
		Consumer<String> aff = System.out::println;
		aff.accept("coucou j ai la tete qui tourne !!");
		
		Consumer<Integer> sp = p1::setAge; 
		
		sp.accept(10);
		aff.accept(tp.produit());
		sp.accept(20);
		aff.accept(tp.produit());
	}
}
