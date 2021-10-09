import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a quantidade kg de maçãs compradas: ");
		float qtd1 = entrada.nextFloat();
		
		System.out.print("Informe a quantidade kg de morangos comprados: ");
		float qtd2 = entrada.nextFloat();
		
		double preco;
		double precoMaca;
		double precoMorango;
		
		if (qtd1 <= 5) {
			precoMaca = 1.80;
		} else {
			precoMaca = 1.50;
		}
		
		if (qtd2 <= 5) {
			precoMorango = 2.50;
		} else {
			precoMorango = 2.20;
		}
		
		preco = (precoMaca * qtd1) + (precoMorango * qtd2);
		
		if ((qtd1 + qtd2) > 8 || preco > 25) {
			preco = preco - (preco * 0.1);
		}
		
		System.out.println("Preço a ser pago: R$ " + preco);
		
		entrada.close();
	}

}
