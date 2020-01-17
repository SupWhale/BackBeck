import java.util.Scanner;

public class Backjoon_15953 {

	public static void main(String[] args) {
		int rank17[] = {500, 300, 200, 50, 30 ,10};
		int rank18[] = {512, 256, 128, 64, 32};
		int people17[] = {1,2,3,4,5,6};
		int people18[] = {1,2,4,8,16};
		Scanner scan = new Scanner(System.in);
		int countJ = scan.nextInt();
		int First_F[] = new int[countJ];
		int Second_F[] = new int[countJ];
		for(int i=0; i<countJ; i++) {
			First_F[i] = scan.nextInt();
			Second_F[i] = scan.nextInt();
		}
		for(int i=0; i<countJ; i++) {
			System.out.println((Code_M1(First_F[i])+Code_M2(Second_F[i]))*10000);
		}
		
	}
public static int Code_M1(int f) {
	int reward = 0;
	if(f == 0)
		return reward;
	else if(f == 1) 
		return reward = 500;
	else if(2 <= f && f <= 3) 
		return reward = 300;
	else if(4<=f && f <=6)
		return reward = 200;
	else if(7<=f && f <=10)
		return reward = 50;
	else if(11<=f && f <=15)
		return reward = 30;
	else if(16<=f && f <=20)
		return reward = 10;
	else
		return reward;
}
public static int Code_M2(int f) {
	int reward = 0;
	if(f == 0)
		return reward;
	else if(f == 1) 
		return reward = 512;
	else if(2 <= f && f <= 3) 
		return reward = 256;
	else if(4<=f && f <=7)
		return reward = 128;
	else if(8<=f && f <=15)
		return reward = 64;
	else if(16<=f && f <=32)
		return reward = 32;
	else
		return reward;
}
public static int getRank(int rank17, int rank18) {
	int totalReward = 0;
	int r =0;
	
	
	
	return totalReward;
}
}
