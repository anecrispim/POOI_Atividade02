import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe uma data dd/mm/YYYY: ");
		String data = entrada.next();
		
		if (data.length() == 10) {
			System.out.println("Data v�lida!");
		} else {
			System.out.println("Data Inv�lida!");
		}
		
		entrada.close();

	}

}
