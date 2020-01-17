import java.util.Scanner;

public class Backjoon_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=0; i<count; i++) {
			String Quiz = sc.next();
			int counter = 0;
			int Co = 0;
			for(int j=0; j<Quiz.length(); j++) {
				if(Quiz.charAt(j) == 'O')
					counter += ++Co;
				else
					Co = 0;
			}
			System.out.println(counter);
		}
	}

}
