import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o salario: ");
		float salario = entrada.nextFloat();
		
		String aumento;
		double valorA;
		double salarioN;
		if (salario <= 280) {
			aumento = "20%";
			valorA = salario * 0.2;
			salarioN = salario + valorA;
		} else if (salario > 280 && salario <= 700) {
			aumento = "15%";
			valorA = salario * 0.15;
			salarioN = salario + valorA;
		} else if (salario > 700 && salario <= 1500) {
			aumento = "10%";
			valorA = salario * 0.1;
			salarioN = salario + valorA;
		} else {
			aumento = "5%";
			valorA = salario * 0.05;
			salarioN = salario + valorA;
		}
		
		System.out.println("Salario antes do aumento: " + salario);
		System.out.println("Percentual de aumento: " + aumento);
		System.out.println("Valor do aumento: " + valorA);
		System.out.println("Novo salario: " + salarioN);
		
		entrada.close();
	}

}
