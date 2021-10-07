import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um número: ");
		float num1 = entrada.nextFloat();
		
		System.out.print("Informe outro número: ");
		float num2 = entrada.nextFloat();
		
		if (num1 > num2) {
			System.out.println("O maior número é o Número 1: " + num1);
		} else {
			System.out.println("O maior número é o Número 2" + num2);
		}
		
		entrada.close();
	}

}
