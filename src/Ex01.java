import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um n�mero: ");
		float num1 = entrada.nextFloat();
		
		System.out.print("Informe outro n�mero: ");
		float num2 = entrada.nextFloat();
		
		if (num1 > num2) {
			System.out.println("O maior n�mero � o N�mero 1: " + num1);
		} else {
			System.out.println("O maior n�mero � o N�mero 2" + num2);
		}
		
		entrada.close();
	}

}
