package afpa.main;

import afpa.console.command.CommandeFactory;
import afpa.console.command.interfaces.ICommand;
import afpa.console.command.interfaces.IExitCommand;
import afpa.console.exception.CommandException;
import afpa.console.tools.Keyboard;

public class Program {
	public static void main(String[] args) {
		System.out.println("-- AFPA command line --");
		String cmdStr;
		ICommand command;
		do {
			System.out.print("> ");
			cmdStr = Keyboard.readLine();
			command = CommandeFactory.create(cmdStr);
			try {
				command.run();
			} catch (final CommandException e) {
				System.err.println(e.getMessage());
			}
		} while (!(command instanceof IExitCommand));
	}
}
