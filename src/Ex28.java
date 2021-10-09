import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe S ou N para as perguntas abaixo:\n");
		
		System.out.print("Telefonou para a vítima? ");
		char r1 = entrada.next().charAt(0);
		
		System.out.print("Esteve no local do crime? ");
		char r2 = entrada.next().charAt(0);
		
		System.out.print("Mora perto da vítima? ");
		char r3 = entrada.next().charAt(0);
		
		System.out.print("Devia para a vítima? ");
		char r4 = entrada.next().charAt(0);
		
		System.out.print("Já trabalhou com a vítima? ");
		char r5 = entrada.next().charAt(0);
		
		int cont = 0;
		if (r1 == 's' || r1 == 'S') {
			cont++;
		}
		
		if (r2 == 's' || r2 == 'S') {
			cont++;
		}
		
		if (r3 == 's' || r3 == 'S') {
			cont++;
		}
		
		if (r4 == 's' || r4 == 'S') {
			cont++;
		}
		
		if (r5 == 's' || r5 == 'S') {
			cont++;
		}
		
		if (cont == 2) {
			System.out.println("Suspeita.");
		} else if (cont == 4 || cont == 3) {
			System.out.println("Cúmplice.");
		} else if (cont == 5) {
			System.out.println("Assassino.");
		} else {
			System.out.println("Inocente.");
		}
		
		entrada.close();
	}

}
