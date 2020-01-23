import java.util.Scanner;

public class Backjoon_11718 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		while(sc.hasNextLine()) {
			s = sc.nextLine();
			if(s == null)
				break;
			else
				System.out.println(s);
		}
	}
}
