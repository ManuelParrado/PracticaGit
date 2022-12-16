import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		boolean salida = false;
		

		do {
			
			System.out.println();
			System.out.println("Introduce un numero");
			num1 = sc.nextInt();
			
			System.out.println("Introduce un numero");
			num2 = sc.nextInt();
			
			int opcion = imprimeMenu();
			
			switch (opcion) {
			case 1: {
				System.out.println("Suma");
				System.out.println(num1+" + "+num2+" = "+(num1+num2));
				System.out.println("commit 1");
				System.out.println("commit 2");
				System.out.println("commit 3");
				break;
			}
			default:
				System.out.println();
				System.out.println("Has salido");
				salida = true;
				break;
				
			}
			
		} while (!salida);
		
	}

	public static int imprimeMenu() {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		System.out.println();
		System.out.println("Elige una opcion");
		System.out.println("1- Suma");
		System.out.println("Introzca cualquier otro caracter para Salir");
		opcion = sc.nextInt();
		
		return opcion;
	}
	
	
	
}
