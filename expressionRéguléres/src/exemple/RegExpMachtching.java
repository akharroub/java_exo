package exemple;

public class RegExpMachtching {
	
	public static boolean validImail(String email) {
		//String regExp = "^.+@.+\\..+$";
		//String regExp = "^[\\w.-]+@[a-zA-Z0-9._-]+\\.[a-z]{2,}$";
		String regExp = "^[a-zA-Z]\\d+[a-zA-Z]$";
		return email.matches(regExp);
		
	}

	public static void main(String[] args) {
//		System.out.println(validImail("m.akharroub@gmail.com"));
//		System.out.println(validImail("akharroub@gmail.c"));
//		System.out.println(validImail("akharroub@gmail.com"));
//		System.out.println(validImail("akharroub.gmail.com"));
		
		System.out.println(validImail("abc"));
		System.out.println(validImail("ab3"));
		System.out.println(validImail("4de"));
		System.out.println(validImail("f6h"));
		System.out.println(validImail("789"));

	}

}
