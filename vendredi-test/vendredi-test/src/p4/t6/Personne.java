package p4.t6;

public class Personne {
	private int age;
	
	public Personne() {
		this.age = 20;
	}
	
	public Personne(int a) {
		this.age =a;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Personne [age=" + age + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}
}
