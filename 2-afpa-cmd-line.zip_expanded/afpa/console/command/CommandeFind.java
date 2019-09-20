package afpa.console.command;

import java.io.File;
import java.util.List;

import afpa.console.command.criteres.Critere;
import afpa.console.command.criteres.CritereFactory;
import afpa.console.exception.CommandException;

class CommandeFind extends AbstractCommandeAvecParam {

	public static final String CMD = "find";
	private static final String DESC = "Quitte l'interpréteur de commandes.";

	static {
		CommandeFactory.addCommandeDesc(CMD, DESC);
	}

	public static void chargerStaticPortion() {
	}

	public CommandeFind(String c) {
		super(c, CMD);
	}

	private void find(File file, List<Critere> criteres) {
		boolean res;
		for (final File fIn : file.listFiles()) {
			res = false;
			if (fIn.isFile()) {
				for (final Critere c : criteres) {
					res |= c.test(file.getName());
				}
			}
		}

	}

	@Override
	public String getName() {
		return CMD;
	}

	@Override
	public void run() throws CommandException {
		final List<Critere> criteres = CritereFactory.create(this.parameter);
		this.find(CommandeFactory.CURRENT_FILE, criteres);
	}

}
