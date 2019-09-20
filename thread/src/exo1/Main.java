package exo1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Compteur(" toto", 10));
		Thread t2 =  new Thread(new Compteur(" kiki", 5));
		Thread t3 =  new Thread(new Compteur(" DoDo", 7));
		System.out.println(" début");
		t1.start();
		t2.start();
		t3.start();
		

		t1.join();
		t2.join();
		t3.join();
		System.out.println(" fin");
	}

}
