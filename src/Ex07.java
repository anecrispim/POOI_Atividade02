import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um n�mero: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Informe um n�mero: ");
		int num2 = entrada.nextInt();
		
		System.out.print("Informe um n�mero: ");
		int num3 = entrada.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
			if (num2 > num3) {
				System.out.println(num2);
				System.out.println(num3);
			} else {
				System.out.println(num3);
				System.out.println(num2);
			}
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2);
			if (num1 > num3) {
				System.out.println(num1);
				System.out.println(num3);
			} else {
				System.out.println(num3);
				System.out.println(num1);
			}
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3);
			if (num1 > num2) {
				System.out.println(num1);
				System.out.println(num2);
			} else {
				System.out.println(num2);
				System.out.println(num1);
			}
		}
		
		entrada.close();
	}

}
