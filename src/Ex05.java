import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe uma letra: ");
		char letra = entrada.next().charAt(0);
		
		if (letra == 'A' ||
			letra == 'a' ||
			letra == 'E' ||
			letra == 'e' ||
			letra == 'I' ||
			letra == 'i' ||
			letra == 'O' ||
			letra == 'o' ||
			letra == 'U' ||
			letra == 'u'
		   ) {
			System.out.println("Vogal.");
		} else {
			System.out.println("Consoante.");
		}
		
		entrada.close();
	}

}
