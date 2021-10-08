import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o valor de a: ");
		int a = entrada.nextInt();
		
		if (a == 0) {
			System.out.println("O valor de a � zero, n�o � uma equa��o do segundo grau.");
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
			System.out.println("A equa��o possui duas raizes: x' = " + x1 + " | x'' = " + x2);
		} else if (delta == 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("A equa��o possui apenas uma raiz que �: " + x1);
		} else {
			System.out.println("A equa��o n�o possui raizes reais.");
		}
		
		entrada.close();
	}

}
