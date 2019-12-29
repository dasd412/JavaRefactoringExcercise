package afterTeasing;
import java.io.*;

public class CSVTablePrinter extends CSVPrinter{
    public CSVTablePrinter(CSVReader reader) {
        super(reader);
    }

    public void print() throws IOException {
        System.out.println("<table>");
        for (int row = 0; true; row++) {
            String[] item = readCSV();
            if (item == null) {
                break;
            }
            System.out.print("<tr>");
            for (int column = 0; column < item.length; column++) {
                System.out.print("<td>");
                System.out.print(item[column]);
                System.out.print("</td>");
            }
            System.out.println("</tr>");
        }
        System.out.println("</table>");
    }

	@Override
	public String[] readCSV() throws IOException {
		// TODO Auto-generated method stub
		return csvReader.readCSV();
	}
}
