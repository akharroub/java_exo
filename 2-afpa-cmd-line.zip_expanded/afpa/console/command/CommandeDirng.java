package afpa.console.command;

import java.io.File;

class CommandeDirng extends CommandeDir {

	public static final String CMD = "dirng";
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
		super.run();
		final File[] filesList = CommandeFactory.CURRENT_FILE.listFiles();
		int cmptF = 0;
		int cmptD = 0;

		for (final File childFile : filesList) {
			if (childFile.isDirectory()) {
				cmptD++;
			} else {
				cmptF++;
			}
		}

		System.out.println(cmptF + " fichiers");
		System.out.println(cmptD + " repertoires");
	}

}
