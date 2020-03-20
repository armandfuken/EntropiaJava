import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

public class LeerCSV {
	
public ArrayList<Vector>  LeerCSV(String path,int num) throws CsvValidationException, IOException {
	// TODO Auto-generated constructor stub
	ArrayList<Vector> datos = new ArrayList<Vector>();
	TriangularModel trian = new TriangularModel();
	Functions f = new Functions();
    FileReader archCSV = null;
	archCSV = new FileReader( path);
			CSVParser conPuntoYComa = new CSVParserBuilder().withSeparator(';').build();
			CSVReader csvReader = new CSVReaderBuilder(archCSV).withCSVParser(conPuntoYComa).build();
			String[] fila = null;
			
			
			switch (num) {
			case 1:
				while((fila = csvReader.readNext()) != null) {
					Vector v = new Vector();
					System.out.println(fila[0]);
					System.out.println(datos);
				    v.add(fila[0]);
				    v.add(fila[1]);
				    v.add(fila[2]);
				    v.add(fila[3]);
				    v.add(f.triangular(Double.parseDouble(fila[0]), Double.parseDouble(fila[1]) , 
				    		Double.parseDouble(fila[2]), Double.parseDouble(fila[3])));
				    datos.add(v);
				}
				break;
			case 2:
				while((fila = csvReader.readNext()) != null) {
					Vector v = new Vector();
					System.out.println(fila[0]);
					System.out.println(datos);
				    v.add(fila[0]);
				    v.add(fila[1]);
				    v.add(fila[2]);
				    v.add(fila[3]);
				    v.add(fila[4]);
				    v.add(f.trapezoidal(Double.parseDouble(fila[0]), Double.parseDouble(fila[1]) , 
				    		Double.parseDouble(fila[2]), Double.parseDouble(fila[3]),Double.parseDouble(fila[4])));
				    datos.add(v);
				}
				break;
			case 3:
				while((fila = csvReader.readNext()) != null) {
					Vector v = new Vector();
					System.out.println(fila[0]);
					System.out.println(datos);
				    v.add(fila[0]);
				    v.add(fila[1]);
				    v.add(fila[2]);
				    v.add(f.gaussian(Double.parseDouble(fila[0]), Double.parseDouble(fila[1]) , 
				    		Double.parseDouble(fila[2])));
				    datos.add(v);
				}
				break;
			case 4:
				while((fila = csvReader.readNext()) != null) {
					Vector v = new Vector();
					System.out.println(fila[0]);
					System.out.println(datos);
				    v.add(fila[0]);
				    v.add(fila[1]);
				    v.add(fila[2]);
				    v.add(f.generalized(Double.parseDouble(fila[0]), Double.parseDouble(fila[1]) , 
				    		Double.parseDouble(fila[2])));
				    datos.add(v);
				}
				break;
			default:
				break;
			}
			csvReader.close();
			return datos;
}
}
