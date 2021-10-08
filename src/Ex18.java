import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o lado 1 do triângulo: ");
		int lado1 = entrada.nextInt();
		
		System.out.print("Informe o lado 2 do triângulo: ");
		int lado2 = entrada.nextInt();
		
		System.out.print("Informe o lado 3 do triângulo: ");
		int lado3 = entrada.nextInt();
		
		int somaL1L2 = lado1 + lado2;
		int somaL2L3 = lado2 + lado3;
		int somaL1L3 = lado1 + lado3;
		
		boolean triangulo = true;
		
		if (somaL2L3 > lado1) {
			System.out.println("É um triângulo.");
		} else if (somaL1L3 > lado2) {
			System.out.println("É um triângulo.");
		} else if (somaL1L2 > lado3) {
			System.out.println("É um triângulo.");
		} else {
			triangulo = false;
			System.out.println("Não é um triângulo.");
		}
		
		if (triangulo) {
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Triângulo Equilatero.");
			} else if (lado1 == lado2 && lado1 != lado3 || 
					   lado1 == lado3 && lado1 != lado2 ||
					   lado2 == lado3 && lado1 != lado2
					  ) {
				System.out.println("Triângulo Isósceles.");
			} else {
				System.out.println("Triângulo Escaleno.");
			}
		}

		entrada.close();
	}

}
