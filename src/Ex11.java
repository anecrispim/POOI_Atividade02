import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Turnos: ");
		System.out.println("M-Matutino | V-Vespertino | N- Noturno\n");
		
		System.out.print("Informe seu turno: ");
		char turno = entrada.next().charAt(0);
		
		if (turno == 'V' || turno == 'v') {
			System.out.println("Boa Tarde");
		} else if (turno == 'M' || turno == 'm') {
			System.out.println("Bom Dia");
		} else if (turno == 'N' || turno == 'n') {
			System.out.println("Boa Noite");
		} else {
			System.out.println("O programa não pode indentificar o turno enviado.");
		}
		
		entrada.close();
	}

}
