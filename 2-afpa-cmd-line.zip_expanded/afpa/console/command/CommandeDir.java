package afpa.console.command;

import java.io.File;

import afpa.console.command.interfaces.ICommand;

class CommandeDir implements ICommand {

	public static final String CMD = "dir";
	private static final String DESC = "Affiche la liste des fichiers et des sous-répertoires d’un répertoire.";

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
		final File[] filesList = CommandeFactory.CURRENT_FILE.listFiles();
		for (final File childFile : filesList) {
			System.out.println((childFile.isDirectory() ? "<DIR> " : "      ") + childFile.getName());
		}
	}

}
