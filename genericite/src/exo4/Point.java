package exo4;

public class Point implements Comparable<Point>{

	 private int x;
	 private int y;
	 private double distance;
	 
	    Point (int x, int y) {
	        this.x = x ;
	        this.y = y ;
	        this.distance=this.distancePoint(this.x,this.y);
	    }
	    

		public double getDistance() {
			return distance;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + ", distance=" + distance + "]";
		}


		public void setDistance(double distance) {
			this.distance = distance;
		}
		
		public void affiche(){
			System.out.println ("coordonnees : " + x + " " + y ) ;
		}
		
		public double distancePoint(int x, int y) {
			return Math.sqrt(((0 - x) * (0 - x)) + ((0 - y) * (0 - y)));
		}
		
		@Override
		public int compareTo(Point o) {
			if (this.distance > o.getDistance()) {
				return 1;
			}else if (this.distance == o.getDistance()) {
				return 0;
			}else {
				return -1;
			}
			
		}
		
	}