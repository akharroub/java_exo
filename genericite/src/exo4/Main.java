package exo4;

public class Main {

	public static void main(String[] args) {
		Integer[] intArray = { 2, 2, 3, 4, 2 };
		System.out.println(MethodeGenerique.maxVall(intArray)); 

		Character[] charArray = { '1', '2', '3', 'z', '2' };
		System.out.println(MethodeGenerique.maxVall(charArray)); 


		Point p1 = new Point(1, 10);
		p1.affiche();
		System.out.println(p1.getDistance());
		Point p2 = new Point(1, 4);
		p2.affiche();
		System.out.println(p2.getDistance());
		Point p3 = new Point(3, 5);
		p3.affiche();
		System.out.println(p3.getDistance());

		Point[] tabPoint = new Point[3];
		tabPoint[0] = p1;
		tabPoint[1] = p2;
		tabPoint[2] = p3;
		System.out.println(MethodeGenerique.maxVall(tabPoint));
	}

}
