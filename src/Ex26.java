import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um número: ");
		float num = entrada.nextFloat();
		
		
		float div = num / Math.round(num);
		
		if (div == 1) {
			System.out.println("Inteiro");
		} else {
			System.out.println("Decimal");
		}

		entrada.close();
	}

}
