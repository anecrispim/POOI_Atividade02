import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o pre�o do produto: ");
		float preco = entrada.nextFloat();

		System.out.print("Informe o c�digo do produto: ");
		int num = entrada.nextInt();
		
        System.out.println("Pre�o: " + preco);
		switch (num) {
		case 1:
			System.out.println("Proced�ncia: Sul");
			break;
		case 2:
			System.out.println("Proced�ncia: Norte");
			break;
		case 3:
			System.out.println("Proced�ncia: Leste");
			break;
		case 4:
			System.out.println("Proced�ncia: Oeste");
			break;
		case 5:
			System.out.println("Proced�ncia: Nordeste");
			break;
		case 6:
			System.out.println("Proced�ncia: Nordeste");
			break;
		case 7:
			System.out.println("Proced�ncia: Centro-Oeste");
			break;
		case 8:
			System.out.println("Proced�ncia: Centro-Oeste");
			break;
		default:
			System.out.println("Proced�ncia: Estrangeiro");
			break;
		}
		
		entrada.close();
	}

}
