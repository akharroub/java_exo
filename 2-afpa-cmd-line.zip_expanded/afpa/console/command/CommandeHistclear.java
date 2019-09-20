package afpa.console.command;

import java.util.List;

import afpa.console.command.interfaces.ICommand;
import afpa.console.hist.EntreeCmdHist;

class CommandeHistclear implements ICommand {

	public static final String CMD = "histclear";
	private static final String DESC = "Vide l'historique des commandes.";

	static {
		CommandeFactory.addCommandeDesc(CMD, DESC);
	}

	public static void chargerStaticPortion() {
	}

	private final List<EntreeCmdHist> commandList;

	public CommandeHistclear(List<EntreeCmdHist> commandesHistList) {
		this.commandList = commandesHistList;
	}

	@Override
	public String getName() {
		return CMD;
	}

	@Override
	public void run() {
		this.commandList.clear();
	}

}
