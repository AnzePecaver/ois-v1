import java.util.*;

public class Gravitacija {
	
	public static void main(String[] args) {
		System.out.print("OIS je zakon!");
		
		Scanner scan = new Scanner(System.in);
		
		double nadmorskaVisina = scan.nextDouble();
		
		double gravitacijskiPospesek = (6.674 * Math.pow(10.0, -11.0) * 5.972 * Math.pow(10.0, 24.0)) / Math.pow(nadmorskaVisina + 6371000.0, 2.0);
		
		System.out.print(gravitacijskiPospesek);
	}
	
}