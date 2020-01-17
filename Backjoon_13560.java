import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_13560 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int count[] = new int[c];
		int n=0;
		for(int i=0; i<c; i++)
			count[i] = sc.nextInt();
		Arrays.sort(count);
		for(int i=0;i<c;i++) {
			n += count[i];
			if(n < (i+1)*i/2) {
				break;
			}
		}
		System.out.println(n == c*(c-1)/2 ? 1: -1);
	}
}
