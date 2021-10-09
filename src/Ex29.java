import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tipos de gasolina: \n A - Álcool | G - Gasolina");
		
		System.out.print("Informe o tipo de gasolina: ");
		char tipo = entrada.next().charAt(0);
		
		System.out.print("Informe a quantidade de litros vendidos: ");
		int litros = entrada.nextInt();
		
		double preco;
		
		if (tipo == 'a' || tipo == 'A') {
			if (litros <= 20) {
				preco = (1.9 - (1.9 * 0.03)) * litros;
			} else {
				preco = (1.9 - (1.9 * 0.05)) * litros;
			}
			System.out.println("O preço a ser pago pelo álcool é de R$ " + preco);
		} else if (tipo == 'g' || tipo == 'G') {
			if (litros <= 20) {
				preco = (2.5 - (2.5 * 0.04)) * litros;
			} else {
				preco = (2.5 - (2.5 * 0.06)) * litros;
			}
			System.out.println("O preço a ser pago pela gasolina é de R$ " + preco);
		} else {
			System.out.println("Tipo de combustível inválido.");
		}
		
		entrada.close();
	}

}
