package afterTeasing;

import java.io.IOException;

public abstract class CSVPrinter {
	
	protected final CSVReader csvReader;
	
	protected CSVPrinter(CSVReader reader) {
		this.csvReader=reader;
	}

	public abstract String[] readCSV()throws IOException;
	public abstract void print()throws IOException;
	
}
