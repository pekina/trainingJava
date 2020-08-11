import java.util.Scanner;

public class HelloWorld {
	public static void main(String Args[]) {
		System.out.println("Hola Mundo");
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		
		switch(num)
		{
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("dos");
				break;
			case 4:
				System.out.println("cuatro");
				break;
			default:
				System.out.println("no sé");
				break;
		}
	}
	/*public String toString()
	{
		return "";
	}*/
}
