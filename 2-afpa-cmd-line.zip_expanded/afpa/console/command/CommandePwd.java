package afpa.console.command;

import afpa.console.command.interfaces.ICommand;

class CommandePwd implements ICommand {

	public static final String CMD = "pwd";
	private static final String DESC = "Affiche chemin du repertoire en cours.";

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
		System.out.println(CommandeFactory.CURRENT_FILE.getAbsolutePath());
	}
}
