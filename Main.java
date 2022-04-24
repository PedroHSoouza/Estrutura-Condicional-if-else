import java.util.Scanner;

public class Main {
	
	public static void main (String[] arg) {
		
	
	int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
	if (n <0) {
			System.out.println("Negativo");	
		}
	else {
			System.out.println("Não Negativo");
		}
		
		
		sc.close();
				
	}
	
	
}