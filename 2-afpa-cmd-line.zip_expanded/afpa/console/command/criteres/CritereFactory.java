package afpa.console.command.criteres;

import java.util.ArrayList;
import java.util.List;

import afpa.console.exception.CommandException;
import afpa.console.exception.OptionsIncorrectesException;
import afpa.console.exception.ParametresIncorrectesException;

public class CritereFactory {

	public static List<Critere> create(String params) throws CommandException {
		final String[] options = params.split(" ");
		final List<Critere> res = new ArrayList<>();
		if (options.length == 0) {

		} else {
			Critere c = null;
			for (int i = 0; i < options.length; i++) {
				if (options[i].startsWith("-")) {
					if (i + 1 > options.length) {
						throw new ParametresIncorrectesException(params);

					} else if ("-starts".equals(options[i])) {
						c = new CritereStarts(options[i + 1]);
						i++;

					} else if ("-ends".equals(options[i])) {
						c = new CritereEnds(options[i + 1]);
						i++;
					} else {
						throw new OptionsIncorrectesException(options[i]);
					}
				} else {
					c = new CritereEqual(options[i]);
					break;
				}
			}
			res.add(c);
		}
		return res;
	}

}
