package p4.t6;

public class ConsommateurString {
	
	public ConsommateurString() {
		
	}
	
	public static void consomme(String s) {
		for(int i = 0; i<s.length(); i++) {
			System.out.println(s.toUpperCase());
		}
	}
}
