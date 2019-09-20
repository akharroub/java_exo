package afpa.console.command;

import afpa.console.command.interfaces.ICommand;

class CommandeVide implements ICommand {

	@Override
	public String getName() {
		return "";
	}

	@Override
	public void run() {
	}
}
