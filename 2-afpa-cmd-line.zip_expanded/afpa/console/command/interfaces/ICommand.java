package afpa.console.command.interfaces;

import afpa.console.exception.CommandException;

public interface ICommand {
	String getName();

	void run() throws CommandException;
}
