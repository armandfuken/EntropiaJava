import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ChooseFile {
	Scanner entrada = null;

	public String ChooseFile() {
		JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        String ruta = fileChooser.getSelectedFile().getAbsolutePath();
        System.out.print(ruta);
        return ruta;
	}
}
