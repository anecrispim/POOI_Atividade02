import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o lado 1 do tri�ngulo: ");
		int lado1 = entrada.nextInt();
		
		System.out.print("Informe o lado 2 do tri�ngulo: ");
		int lado2 = entrada.nextInt();
		
		System.out.print("Informe o lado 3 do tri�ngulo: ");
		int lado3 = entrada.nextInt();
		
		int somaL1L2 = lado1 + lado2;
		int somaL2L3 = lado2 + lado3;
		int somaL1L3 = lado1 + lado3;
		
		boolean triangulo = true;
		
		if (somaL2L3 > lado1) {
			System.out.println("� um tri�ngulo.");
		} else if (somaL1L3 > lado2) {
			System.out.println("� um tri�ngulo.");
		} else if (somaL1L2 > lado3) {
			System.out.println("� um tri�ngulo.");
		} else {
			triangulo = false;
			System.out.println("N�o � um tri�ngulo.");
		}
		
		if (triangulo) {
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Tri�ngulo Equilatero.");
			} else if (lado1 == lado2 && lado1 != lado3 || 
					   lado1 == lado3 && lado1 != lado2 ||
					   lado2 == lado3 && lado1 != lado2
					  ) {
				System.out.println("Tri�ngulo Is�sceles.");
			} else {
				System.out.println("Tri�ngulo Escaleno.");
			}
		}

		entrada.close();
	}

}
