import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a nota 1: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("Informe a nota 2: ");
		float nota2 = entrada.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		String conceito;
		String result;

		if (media >= 9 && media <= 10) {
			conceito = "A";
			result = "Aprovado";
		} else if (media >= 7.5 && media < 9){
			conceito = "B";
			result = "Aprovado";
		} else if (media >= 6 && media < 7.5){
			conceito = "C";
			result = "Aprovado";
		} else if (media >= 4 && media < 6){
			conceito = "D";
			result = "Reprovado";
		} else {
			conceito = "E";
			result = "Reprovado";
		}
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		System.out.println("Resultado: " + result);
				
		entrada.close();
	}

}
