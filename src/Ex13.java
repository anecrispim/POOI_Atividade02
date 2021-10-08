import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quanto você ganha por hora: ");
		float valorH = entrada.nextFloat();
		
		System.out.print("Informe quantas horas você trablha por mês: ");
		float mesH = entrada.nextFloat();
		
		float salarioB = mesH * valorH;
		double inss = salarioB * 0.1;
		double sindicato = salarioB * 0.03;
		double fgts = salarioB * 0.11;
		double ir;
		String irP;
		if (salarioB <= 900) {
			ir = 0.0;
			irP = "0%";
		} else if (salarioB <= 1500) {
			ir = salarioB * 0.05;
			irP = "5%";
		} else if (salarioB <= 2500) {
			ir = salarioB * 0.1;
			irP = "10%";
		} else {
			ir = salarioB * 0.2;
			irP = "20%";
		}

		double totalD = inss + ir + sindicato;
		double salarioL = salarioB - totalD;
		
		
		System.out.println("Salário Bruto: " + valorH + " * " + mesH + " : " + " R$ " + salarioB);
		System.out.println("(-) IR( " + irP + "): R$ " + ir);
		System.out.println("(-) INSS (10%): R$ " + inss);
		System.out.println("(-) Sindicato (3%): R$ " + sindicato);
		System.out.println("FGTS (11%): R$ " + fgts);
		System.out.println("Tota de Descontos: R$ " + totalD);
		System.out.println("Salario Líquido: R$ " + salarioL);
		
		entrada.close();
	}

}
