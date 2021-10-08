import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int num = entrada.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par para Impar: " + (num + 1));
		} else {
			System.out.println("Impar para Par: " + (num + 1));
		}
		
		entrada.close();
	}

}
