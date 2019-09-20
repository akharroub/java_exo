package afpa.console.command;

import java.util.Map;
import java.util.Map.Entry;

import afpa.console.command.interfaces.ICommand;

class CommandeHelp implements ICommand {

	public static final String CMD = "help";
	private static final String DESC = "Affiche des informations sur les commandes.";

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
		final Map<String, String> commandesList = CommandeFactory.getCommandesList();
		for (final Entry<String, String> e : commandesList.entrySet()) {
			System.out.println(String.format("%0$-15s", e.getKey()) + " : " + e.getValue());
		}
	}
}
