import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor de a: ");
		int a = entrada.nextInt();
		
		if (a == 0) {
			System.out.println("O valor de a é zero, não é uma equação do segundo grau.");
			System.exit(0);
		}

		System.out.print("Informe o valor de b: ");
		int b = entrada.nextInt();
		
		System.out.print("Informe o valor de c: ");
		int c = entrada.nextInt();
		
		float delta = (b * b) - 4 * a *c;
		double x1;
		double x2;
		
		if (delta > 0) {
			x1 = (-(b) + Math.sqrt(delta)) / (2 * a);
			x2 = (-(b) - Math.sqrt(delta)) / (2 * a);
			System.out.println("A equação possui duas raizes: x' = " + x1 + " | x'' = " + x2);
		} else if (delta == 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("A equação possui apenas uma raiz que é: " + x1);
		} else {
			System.out.println("A equação não possui raizes reais.");
		}
		
		entrada.close();
	}

}
