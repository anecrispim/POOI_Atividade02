import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Carnes:\n 1-Fil� duplo | 2-Alcatra | 3-Picanha");
		
		System.out.print("Informe o tipo de carne: ");
		int tipo = entrada.nextInt();
		
		System.out.print("Informe a quantidade de kg comprados: ");
		float qtd = entrada.nextFloat();
		
		System.out.println("Responda:\n 1 para Sim ou 0 para N�o");
		
		System.out.print("Compra feita no cart�o Tbajara? ");
		int ca = entrada.nextInt();
		
		double preco;
		double desc;
		
		boolean cartao = (ca == 1 ? true : false);
		
		switch (tipo) {
		case 1:
			if (qtd <= 5) {
				preco = 4.90 * qtd;
			} else {
				preco = 5.80 * qtd;
			}
			desc = 0.0;
			if (cartao) {
				desc = (preco * 0.1);
				preco = preco - desc;
			}
			
			System.out.println("Tipo: 1-Fil� Duplo\n");
			System.out.println("-------------------------\n");
			System.out.println("Quantidade de carne: " + qtd + "\n");
			System.out.println("-------------------------\n");
			System.out.println("Tipo de pagamento: " + (cartao ? "Cart�o Tabajara" : "Dinheiro")  + "\n");
			System.out.println("-------------------------\n");
			System.out.println("Valor desconto: R$ " + desc + "\n");
			System.out.println("-------------------------\n");
			System.out.println("Valor a pagar: R$ " + preco + "\n");
			break;
		case 2:
			if (qtd <= 5) {
				preco = 5.90 * qtd;
			} else {
				preco = 6.80 * qtd;
			}
			
			desc = 0.0;
			if (cartao) {
				desc = (preco * 0.1);
				preco = preco - desc;
			}
			
			System.out.println("Tipo: 2-Alcatra\n");
			System.out.println("-------------------------\n");
			System.out.println("Quantidade de carne: " + qtd + "\n");
			System.out.println("-------------------------\n");
			System.out.println("Tipo de pagamento: " + (cartao ? "Cart�o Tabajara" : "Dinheiro")  + "\n");
			System.out.println("-------------------------\n");
			System.out.println("Valor desconto: R$ " + desc + "\n");
			System.out.println("-------------------------\n");
			System.out.println("Valor a pagar: R$ " + preco + "\n");
			break;
		case 3:
			if (qtd <= 5) {
				preco = 6.90 * qtd;
			} else {
				preco = 7.80 * qtd;
			}
			
			desc = 0.0;
			if (cartao) {
				desc = (preco * 0.1);
				preco = preco - desc;
			}
			
			System.out.println("Tipo: 3-Picanha\n");
			System.out.println("-------------------------\n");
			System.out.println("Quantidade de carne: " + qtd + "\n");
			System.out.println("-------------------------\n");
			System.out.println("Tipo de pagamento: " + (cartao ? "Cart�o Tabajara" : "Dinheiro")  + "\n");
			System.out.println("-------------------------\n");
			System.out.println("Valor desconto: R$ " + desc + "\n");
			System.out.println("-------------------------\n");
			System.out.println("Valor a pagar: R$ " + preco + "\n");
			break;
		default:
			System.out.println("Tipo de carne inv�lido.");
			break;
		}
		
		entrada.close();
	}

}
