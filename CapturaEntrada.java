import java.util.*;

class CapturaEntrada{
	
	
	//captura un dato tipo int introducido por teclado
	public static int capturaEntero(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+"");
		return (sc.nextInt());
	}
	
	
	//captura un dato tipo String introducido por teclado
	public static String capturaString(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+"");
		return (sc.nextLine());
	}

	public static double capturaDouble(String msg){
		Scanner sc = new Scanner(System.in);
		System.out.print(""+msg+"");
		return (sc.nextDouble());
	}
}