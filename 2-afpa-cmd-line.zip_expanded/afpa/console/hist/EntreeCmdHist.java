package afpa.console.hist;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EntreeCmdHist {
	private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

	private final String cmd;
	private final Date dateCreation;

	public EntreeCmdHist(String c) {
		this.cmd = c;
		this.dateCreation = new Date();
	}

	@Override
	public String toString() {
		return SDF.format(this.dateCreation) + " " + this.cmd;
	}
}
