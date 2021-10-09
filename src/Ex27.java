import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a número 1: ");
		float num1 = entrada.nextFloat();
		
		System.out.print("Informe a número 2: ");
		float num2 = entrada.nextFloat();
		
		System.out.println("Operações:\n 1-Adição | 2-Subtração | 3-Multiplicação | 4-Divisão");
		
		System.out.print("Informe o tipo da operação que deseja: ");
		int ope = entrada.nextInt();
		
		float result = 0;
		switch (ope) {
		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			result = num1 / num2;
			break;
		default:
			System.out.println("Tipo de operação inválida.");
			break;
		}
		
		if (result != 0) {
			System.out.println("Resultado: " + result);
			
			if (result % 2 == 0) {
				System.out.println("Par.");
			} else {
				System.out.println("Impar.");
			}
			
			if (result > 0) {
				System.out.println("Positivo");
			} else if (result < 0) {
				System.out.println("Negativo");
			} else {
				System.out.println("Zero");
			}
			
			float div = result / Math.round(result);
			
			if (div == 1.0 || div == 0.0) {
				System.out.println("Inteiro");
			} else {
				System.out.println("Decimal");
			}
		}
		
		entrada.close();
	}

}
