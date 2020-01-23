import java.util.Scanner;

public class Backjoon_2741 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println(count);
		for(int i=count; i>0; i--) {
			System.out.println(count-i+1);
		}
	}
}
