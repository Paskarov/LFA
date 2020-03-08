import java.util.Scanner;

public class MaquinaVenda {
	public static void main(String[] args) {
		
		double valor = 0;
		double total = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (total < 0.45) {
			
			System.out.printf("Insira o valor da Moeda: ", "%.2f");
			valor = input.nextDouble();
			
			if (valor == 0.10 || valor == 0.25) {
				total += valor;
			
			} else {
				System.out.println("Valor inválido !");
			}
			
			if (total >= 0.45) {
				System.out.printf("Valor inserido R$ %.2f", total);
        System.out.println("Retire sua Coca-Cola!");
			}
		}
	}
}
