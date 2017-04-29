package genericite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.Vector;

public class ExportTool {

	public static <T> void exportCsv(String cheminFichier, Vector<T> listeC) throws Exception {
		BufferedWriter fw = new BufferedWriter(new FileWriter(cheminFichier));

		if (listeC != null && listeC.size() > 0) {
			Field[] tab = listeC.get(0).getClass().getDeclaredFields();
			StringBuilder ligneEntete = new StringBuilder();
			for (Field f : tab) {
				ligneEntete.append(f.getName()).append(";");
			}
			
			fw.write(ligneEntete.substring(0,ligneEntete.length()-1));
			fw.newLine();
			
			for (T cb : listeC) {
				StringBuilder ligne = new StringBuilder();
				for (Field f : tab) {
					ligne.append(f.get(cb).toString()).append(";");
				}
				fw.write(ligne.substring(0,ligne.length()-1));
				fw.newLine();
			}
		}
		fw.close();
	}
}
