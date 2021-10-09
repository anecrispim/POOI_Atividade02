import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char gabarito[] = {'a', 'a', 'b', 'b', 'c', 'c', 'd', 'd', 'e', 'e'};
		String respostas[] = new String[10];
		
		int cont = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Informe o resultado da Questão " + (i + 1) + ": ");
			char result = entrada.next().charAt(0);
			
			if (result == gabarito[i]) {
				respostas[i] = result + " - Correto";
				cont++;
			} else {
				respostas[i] = result + " - Errado, Resposta correta " + gabarito[i];
			}
		}
		
		for (int i = 0; i < respostas.length; i++) {
			System.out.println("Q" + (i + 1) + ": " + respostas[i]);
		}
		System.out.println("Pontuação Final: " + cont);
		
		entrada.close();
	}

}
