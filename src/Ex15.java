import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o preço do produto: ");
		float preco = entrada.nextFloat();

		System.out.print("Informe o código do produto: ");
		int num = entrada.nextInt();
		
        System.out.println("Preço: " + preco);
		switch (num) {
		case 1:
			System.out.println("Procedência: Sul");
			break;
		case 2:
			System.out.println("Procedência: Norte");
			break;
		case 3:
			System.out.println("Procedência: Leste");
			break;
		case 4:
			System.out.println("Procedência: Oeste");
			break;
		case 5:
			System.out.println("Procedência: Nordeste");
			break;
		case 6:
			System.out.println("Procedência: Nordeste");
			break;
		case 7:
			System.out.println("Procedência: Centro-Oeste");
			break;
		case 8:
			System.out.println("Procedência: Centro-Oeste");
			break;
		default:
			System.out.println("Procedência: Estrangeiro");
			break;
		}
		
		entrada.close();
	}

}
