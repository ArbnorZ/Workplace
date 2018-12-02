import java.util.ArrayList;

public class Einmaleins {
	public static void main(String[] args) {

		for (String[] ausgabe: einmaleins()) {
			for (String ausgabe2: ausgabe) {
				System.out.print(ausgabe2 + "\t");
			}
			System.out.println();
		}
	}
	public static ArrayList<String[]> einmaleins() {
		ArrayList<String[]> array = new ArrayList<String[]>();
		String[] zeile = new String[10];
		int n = 0;
		for (int y = 1; y <= 10; y++) {
			int index = 0;
			for (int i = 1; i <= 10; i++) {
				zeile[index] = i + " * " + y + " = " + (y*i);
				index++;
			}
			String a = zeile[0]; String b = zeile[1]; String c = zeile[2]; String d = zeile[3];
			String e = zeile[4]; String f = zeile[5]; String g = zeile[6]; String h = zeile[7];
			String i = zeile[8]; String j = zeile[9];
			array.add(n, new String[] {a , b , c , d , e , f , g , h , i , j});
			n++;
		}
		return array;
	}
}
