package ejercicios;
import java.util.Scanner;

public class Bienvenido {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe tu nombre:");
		String nombre = entrada.next();
		System.out.println("Bienvenid@ " + nombre);
		entrada.close();
	}
}
