package afpa.console.command;

import afpa.console.command.interfaces.ICommand;
import afpa.console.command.interfaces.IExitCommand;

class CommandeQuit implements ICommand, IExitCommand {

	public static final String CMD = "quit";
	private static final String DESC = "Quitte l'interpréteur de commandes.";

	static {
		CommandeFactory.addCommandeDesc(CMD, DESC);
	}

	public static void chargerStaticPortion() {
	}

	@Override
	public String getName() {
		return CMD;
	}

	@Override
	public void run() {
	}

}
