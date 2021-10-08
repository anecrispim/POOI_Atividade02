import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor do saque: ");
		int num = entrada.nextInt();
		
		int notas100;
		int notas50;
		int notas10;
		int notas5;
		int notas1;
		if (num >= 10 && num <= 600) {
			notas100 = num / 100;
			notas50 = (num - (notas100 * 100)) / 50;
			notas10 = (num - (notas100 * 100) - (50 * notas50)) / 10;
			notas5 = (num - (notas100 * 100) - (50 * notas50) - (10 * notas10)) / 5;
			notas1 = num - (notas100 * 100) - (50 * notas50) - (10 * notas10) - (5 * notas5);
			if (notas100 >= 1) {
				System.out.println("Imprimindo " + notas100 + " notas de 100.");
			}
			if (notas50 >= 1) {
				System.out.println("Imprimindo " + notas50 + " notas de 50.");
			}
			if (notas10 >= 1) {
				System.out.println("Imprimindo " + notas10 + " notas de 10.");
			}
			if (notas5 >= 1) {
				System.out.println("Imprimindo " + notas5 + " notas de 5.");
			}
			if (notas1 >= 1) {
				System.out.println("Imprimindo " + notas1 + " notas de 1.");
			}
		} else {
			System.out.println("O mínimo do saque é de 10 e o máximo de 600");
		}
		
		entrada.close();
	}

}
