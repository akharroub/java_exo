package afpa.console.command;

import java.io.File;

import afpa.console.constant.Constants;

class CommandeCd extends AbstractCommandeAvecParam {

	public static final String CMD = "cd";
	private static final String DESC = "Modifie le répertoire ou affiche le répertoire actif.";
	public static final String DOUBLE_POINTS = "..";

	static {
		CommandeFactory.addCommandeDesc(CMD, DESC);
	}

	public static void chargerStaticPortion() {
	}

	public CommandeCd(String c) {
		super(c, CMD);
	}

	@Override
	public String getName() {
		return CMD;
	}

	@Override
	public void run() {
		if (DOUBLE_POINTS.equals(this.parameter)) {
			CommandeFactory.CURRENT_FILE = CommandeFactory.CURRENT_FILE.getParentFile();

		} else {
			boolean childFound = false;
			for (final File child : CommandeFactory.CURRENT_FILE.listFiles()) {
				if (child.getName().equalsIgnoreCase(this.parameter)) {
					if (child.isDirectory()) {
						CommandeFactory.CURRENT_FILE = child;
					} else {
						System.out.println(Constants.PATH_NOT_A_DIRECTORY);
					}
					childFound = true;
					break;
				}
			}
			if (!childFound) {
				System.out.println(Constants.PATH_NOT_FOUND);
			}
		}
	}

}
