package afpa.console.command;

import java.util.List;

import afpa.console.command.interfaces.ICommand;
import afpa.console.hist.EntreeCmdHist;

class CommandeHist implements ICommand {

	public static final String CMD = "hist";
	private static final String DESC = "Affiche l'historique des commandes.";

	static {
		CommandeFactory.addCommandeDesc(CMD, DESC);
	}

	public static void chargerStaticPortion() {
	}

	private final List<EntreeCmdHist> commandList;

	public CommandeHist(List<EntreeCmdHist> commandesHistList) {
		this.commandList = commandesHistList;
	}

	@Override
	public String getName() {
		return CMD;
	}

	@Override
	public void run() {
		for (final EntreeCmdHist c : this.commandList) {
			System.out.println(c);
		}
	}

}
