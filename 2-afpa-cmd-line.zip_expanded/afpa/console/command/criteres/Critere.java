package afpa.console.command.criteres;

import java.util.function.Predicate;

public abstract class Critere implements Predicate<String> {
	protected String param;

	public Critere(String s) {
		this.param = s;
	}
}
