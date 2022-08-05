import java.util.Scanner;

public class ProcessaLocacao {

	/*
	 * cadastrar 10 carros 4 opções
	 * 
	 * opçao 1 mostrar todos os carros opcao 2 abra uma pergunta para escolher o
	 * numero do carro e mostre o correspondente 3 permite fechar o programa
	 * ()default
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int lista = 0;
		String carros[] = { "Camaro", "Gol", "Ka", "Ferrari", "Pajero", "Renegade", "Duster", "Mustang", "Jimny",
				"Siena" };

		System.out.println("Lista de carros");
		for (int i = 0; i <= carros.length - 1; i++) {
			System.out.println((i + 1) + " " + carros[i]);

		}
		System.out.println("Escolha o número do carro: ");
		lista = scan.nextInt();
		
		switch(lista) {
		case 1: System.out.println(carros[0]);break;
		case 2: System.out.println(carros[1]);break;
		case 3: System.out.println(carros[2]);break;
		case 4: System.out.println(carros[3]);break;
		case 5: System.out.println(carros[4]);break;
		case 6: System.out.println(carros[5]);break;
		case 7: System.out.println(carros[6]);break;
		case 8: System.out.println(carros[7]);break;
		case 9: System.out.println(carros[8]);break;
		case 10: System.out.println(carros[9]);break;
		default: System.out.println("Carro não localizado");
		}

	}

}
