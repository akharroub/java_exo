package afpa.console.command;

import afpa.console.command.interfaces.ICommand;

class CommandeIntrouvable implements ICommand {

	@Override
	public String getName() {
		return "";
	}

	@Override
	public void run() {
		System.out.println("command not found.");
	}

}
