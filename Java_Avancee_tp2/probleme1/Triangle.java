package probleme1;

public class Triangle {

	public static int triangle(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 0; // triangle invalide
		} else if (a == b && b == c) {
			return 1; // triangle équilatéral
		} else if (a == b || b == c || a == c) {
			return 2; // triangle isocèle
		} else if (a + b > c && a + c > b && b + c > a) {
			return 3; // triangle valide quelconque
		} else {
			return 0; // triangle invalide
		}
	}

}
