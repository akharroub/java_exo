package exo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PointStream {

	private int x, y ;

	public PointStream (int x, int y) {
		this.x = x ; 
		this.y = y ; 
	}

	public int getX() { 
		return x ; 
	}

	public int getY() { 
		return y ; 
	}

	public void affiche (){
		System.out.println(" [ " + x + ", " + y + "] ") ;
	}

	public static void main(String[] args) {

		//		exo1();
		//		exo2();
		//		exo3();
				exo4();

	}	
	private static void exo4() {
		String[] StringTab = {"aaaaaaa","cezqd","abbbb","cccccccc","dd","wwwwwww"};
		Map<String, List<String>> listMot = Arrays.stream(StringTab).collect(Collectors.groupingBy(e -> e.substring(0,1)));
		System.out.println(listMot);
	}
	

	private static void exo3() {

		String[] StringTab = {"aaaaaaa","bbbb","cccccccc","dd","wwwwwww"};
		String rsl = Arrays.stream(StringTab).filter(s -> s.length()>4).collect(Collectors.joining("|"));
		System.out.println(rsl);
	}

	private static void exo2() {

		Integer[] tabInt = {2,5,-5,4,6,-3,7};
		Stream<PointStream> pointS = Arrays.stream(tabInt).map(e->new PointStream(e, e*2));
		Map<Integer, List<PointStream>> pointMap = pointS.collect(Collectors.groupingBy(x -> x.getX()));
		System.out.println(pointMap);

	}

	private static void exo1() {

		PointStream[] ps = {new PointStream(1,6),new PointStream(5, 2),new PointStream(-3, 4),new PointStream(-2, 8)};

		Arrays.stream(ps)
		.filter(p->p.getX()>0)
		//	.collect(Collectors.toList())
		.forEach(p->p.affiche());

	}

}
