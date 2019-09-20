package p4.t6;

public class AfficheurDebug {
	private Test<String> tuyaux;
	
	public void init(boolean b) {
		if(b) {
			tuyaux = System.out::println;
		} else {
//			ConsommateurString c = new ConsommateurString();
			tuyaux = ConsommateurString::consomme;
		}
	}
	
	public void afficher(String s) {
		this.tuyaux.valuer(s);
	}
	
	
	public static void main(String[] args) {
		AfficheurDebug aff = new AfficheurDebug();
		aff.init(false);
		
		aff.afficher("vv");
		
		aff.afficher("aaaaasdfsdaaaa");
		
		aff.afficher("asr");
	}
}
