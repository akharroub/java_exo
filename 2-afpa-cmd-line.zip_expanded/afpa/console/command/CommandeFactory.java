package afpa.console.command;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import afpa.console.command.interfaces.ICommand;
import afpa.console.command.interfaces.IHistoriqueCommand;
import afpa.console.hist.EntreeCmdHist;

public class CommandeFactory {

	public static File CURRENT_FILE = new File(System.getProperty("user.dir"));

	private static final List<EntreeCmdHist> COMMANDES_HIST_LIST = new ArrayList<>();

	private static final Map<String, String> COMMANDES_LIST_DESC = new HashMap<>();

	static {
		CommandeCd.chargerStaticPortion();
		CommandeHelp.chargerStaticPortion();
		CommandeDir.chargerStaticPortion();
		CommandeDirng.chargerStaticPortion();
		CommandeExit.chargerStaticPortion();
		CommandeFin.chargerStaticPortion();
		CommandeHist.chargerStaticPortion();
		CommandeHistclear.chargerStaticPortion();
		CommandePwd.chargerStaticPortion();
		CommandeQuit.chargerStaticPortion();
	}

	public static void addCommandeDesc(String cmd, String desc) {
		COMMANDES_LIST_DESC.put(cmd, desc);
	}

	public static ICommand create(String cmd) {
		ICommand theCommand = null;

		if (cmd.length() == 0) {
			theCommand = new CommandeVide();

		} else if (CommandePwd.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandePwd();

		} else if (CommandeHist.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandeHist(COMMANDES_HIST_LIST);

		} else if (CommandeExit.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandeExit();

		} else if (CommandeDir.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandeDir();

		} else if (cmd.toLowerCase().startsWith(CommandeCd.CMD + " ")) {
			theCommand = new CommandeCd(cmd);

		} else if (CommandeFin.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandeFin();

		} else if (CommandeHistclear.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandeHistclear(COMMANDES_HIST_LIST);

		} else if (CommandeDirng.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandeDirng();

		} else if (CommandeHelp.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandeHelp();

		} else if (CommandeQuit.CMD.equalsIgnoreCase(cmd)) {
			theCommand = new CommandeQuit();

		} else if (cmd.toLowerCase().startsWith(CommandeFind.CMD + " ")) {
			theCommand = new CommandeFind(cmd);

		} else {
			theCommand = new CommandeIntrouvable();
		}

		if (theCommand != null && !(theCommand instanceof IHistoriqueCommand)) {
			COMMANDES_HIST_LIST.add(new EntreeCmdHist(cmd));
		}

		return theCommand;
	}

	public static Map<String, String> getCommandesList() {
		return new HashMap<>(COMMANDES_LIST_DESC);
	}

}
