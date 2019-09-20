package afpa.console.command;

import afpa.console.command.interfaces.ICommand;

abstract class AbstractCommandeAvecParam implements ICommand {

	protected String parameter;

	public AbstractCommandeAvecParam(String c, String cmd) {
		this.parameter = c.substring(cmd.length()).trim();
	}

}
