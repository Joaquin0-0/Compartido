package P413;
<<<<<<< HEAD

public class P413ClarasyOscuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
=======
public class P413ClarasyOscuras {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int casos = s.nextInt();
		int filas;
		int columnas;
		int blancas = 0;
		int negras = 0;
		int cantidad = 0;
		int total;
		for (int i = 0; i < casos; i++) {
			filas = s.nextInt();
			columnas = s.nextInt();
			total = filas * columnas;
			cantidad = total / 2;
			blancas = cantidad;
			negras = cantidad;
			if (filas == 1 && columnas == 1) {
				blancas = 1;
				negras = 0;
			}
			if (total % 2 != 0) {
				blancas = cantidad + 1;
			}
			System.out.println(blancas+ " "+ negras);
		}
	}
}
>>>>>>> 31af3e4... first commit
