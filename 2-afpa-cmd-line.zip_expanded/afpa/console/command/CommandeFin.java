package afpa.console.command;

class CommandeFin extends CommandeExit {

	public static final String CMD = "fin";
	private static final String DESC = "Quitte l'interpréteur de commandes.";

	static {
		CommandeFactory.addCommandeDesc(CMD, DESC);
	}

	public static void chargerStaticPortion() {
	}

}
