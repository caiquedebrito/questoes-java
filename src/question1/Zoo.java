package question1;

import java.io.IOException;
import java.util.Scanner;

public class Zoo {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		while (true) {
			menu();
		}
	}

	public static void menu() {
		println("Escolha qual animal deseja criar");
		println("1 - Leao\n2 - Cachorro\n3 - Gato\n4 - Tigre\n5 - Hipopotamo\n6 - Sair");
		
		try {
			int option = input.nextInt();
			
			if (option == 6) System.exit(0);
			
			if (option > 5 || option < 1) {
				println("Opcao invalida");
			} else {
				criarAnimal(option);
			}
		} catch (Exception e) {
			println("Algo de errado ocorreu! Tente novamente!");
		}
		
	}
	
	public static void criarAnimal(int opt) {
		Animal animal;
		
		switch(opt) {
			case 1:
				animal = new Leao();
				break;
			case 2:
				animal = new Cachorro();
				break;
			case 3:
				animal = new Gato();
				break;
			case 4:
				animal = new Tigre();
				break;
			case 5:
				animal = new Hipopotamo();
				break;
			default:
				animal = new Animal();
				break;
		}
		
		interagirAnimal(animal);
	}
	
	public static void interagirAnimal(Animal animal) {
		animal.andar();
		animal.comer();
		animal.comunicar();
	}
	
	public static void println(Object obj) {
		System.out.println(obj);
	}
}
