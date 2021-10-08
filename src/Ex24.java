import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a nota 1: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("Informe a nota 2: ");
		float nota2 = entrada.nextFloat();
		
		System.out.print("Informe a nota 3: ");
		float nota3 = entrada.nextFloat();
		
		float media = (nota1 + nota2 + nota3) / 3;
		
		if (media == 10) {
			System.out.println("Aprovado com Distinção.");
		} else if (media >= 7) {
			System.out.println("Média: " + media);
			System.out.println("Aprovado.");
		} else {
			System.out.println("Média: " + media);
			System.out.println("Reprovado.");
		}
				
		entrada.close();
	}

}
