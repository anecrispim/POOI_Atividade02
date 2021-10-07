import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe uma letra F ou M: ");
		char letra = entrada.next().charAt(0);
		
		if (letra == 'F' || letra == 'f') {
			System.out.println("Feminino");
		} else if (letra == 'M' || letra == 'm') {
			System.out.println("Masculino");
		} else {
			System.out.println("Letra inválida");
		}
		
		entrada.close();
	}

}
