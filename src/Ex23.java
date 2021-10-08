import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a idade do aluno 1: ");
		int idade1 = entrada.nextInt();
		
		System.out.print("Informe a idade do aluno 2: ");
		int idade2 = entrada.nextInt();
		
		System.out.print("Informe a idade do aluno 3: ");
		int idade3 = entrada.nextInt();
		
		int media = (idade1 + idade2 + idade3) / 3; 
		
		if (media < 25) {
			System.out.println("Turma jovem.");
		} else if (media >= 25 && media <= 40) {
			System.out.println("Turma adulta.");
		} else {
			System.out.println("Turma idosa.");
		}

		entrada.close();
	}

}
