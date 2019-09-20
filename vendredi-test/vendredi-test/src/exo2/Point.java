package exo2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Point {

	private int x, y ;

	public Point (int x, int y) { 
		this.x = x ; this.y = y ;
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

	  public static void traiteListe(List<Point> lp, Predicate<Point> pred, Comparator<Point> comp, Consumer<Point> cons) {
//        List<Point> lptmp = new ArrayList<Point>();
//        for(Point p : lp) {
//            if(pred.test(p)) {
//                lptmp.add(p);
//            }
//        }
//        lptmp.sort(comp);
//        lptmp.forEach(cons);
        
        lp.stream()
            .filter(pred)
            .sorted(comp)
            .forEach(cons);
    }
	  
	  
	  public static void main(String[] args) {
			List<Point> points = new ArrayList<Point>();
	        points.add(new Point(2, 5));
	        points.add(new Point(7, 3));
	        points.add(new Point(6, 3));
	        
			 traiteListe(points,
		                x->true,
		                 (a,b)->Integer.valueOf(a.x+a.y).compareTo(b.x+b.y),Point::affiche);
			
		}
}
