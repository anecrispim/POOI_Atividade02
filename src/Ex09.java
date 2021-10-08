import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        
		System.out.print("Informe seu sexo F ou M: ");
		char sexo = entrada.next().charAt(0);
		
		System.out.print("Informe sua altura: ");
		float altura = entrada.nextFloat();
		
		System.out.print("Informe seu peso: ");
		float peso = entrada.nextFloat();
		
		double pesoIdeal = 0.0;
		if (sexo == 'F' || sexo == 'f') {
			pesoIdeal = (62.1 * altura) - 44.7;
		} else if (sexo == 'M' || sexo == 'm') {
			pesoIdeal = (72.7 * altura) - 58;
		} else {
			System.out.println("O programa não pode indentificar o sexo enviado.");
		}
		
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		System.out.println("Sexo: " + sexo);
		System.out.println("Peso Ideal: " + pesoIdeal);
		
		if (peso > pesoIdeal) {
			System.out.println("Acima do peso ideal.");
		} else if (peso == pesoIdeal) {
			System.out.println("Peso ideal.");
		} else {
			System.out.println("Abaixo do peso ideal.");
		}
		
		entrada.close();
	}

}
