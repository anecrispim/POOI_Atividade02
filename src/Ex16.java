import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a nota 1: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("Informe a nota 2: ");
		float nota2 = entrada.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Aprovado.");
		} else if (media > 3 && media <= 6.9){
			System.out.println("Em Exame.");
		} else {
			System.out.println("Reprovado.");
		}
				
		entrada.close();

	}

}
