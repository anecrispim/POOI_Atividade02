import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um n�mero: ");
		int num = entrada.nextInt();
		
		int centena;
		int dezena;
		int unidade;
		if (num >= 1000) {
			System.out.println("N�mero n�o pode ser maior que 1000");
		} else {
			if (num >= 100) {
				unidade = num % 10;
				dezena = ((num - unidade) / 10) % 10;
				centena = (num - unidade) / 100;
				System.out.println("O n�mero " + num + " possui "+ unidade + " unidades.");
				System.out.println("O n�mero " + num + " possui "+ dezena + " dezenas.");
				System.out.println("O n�mero " + num + " possui " + centena + " centenas.");
			} else if (num >= 10) {
				unidade = num % 10;
				dezena = ((num - unidade) / 10) % 10;
				System.out.println("O n�mero " + num + " possui "+ unidade + " unidades.");
				System.out.println("O n�mero " + num + " possui "+ dezena + " dezenas.");
			} else {
				unidade = num % 10;
				System.out.println("O n�mero " + num + " possui " + unidade + " unidade.");
			}
		}
		
		entrada.close();
	}

}
