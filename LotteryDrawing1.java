import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers u need to draw?");
		int k = in.nextInt();
		System.out.println("Highest number u can draw?");
		int n = in.nextInt();
		
		int[] numbers = new int[n];
		for (int i=0;i<numbers.length;i++)
			numbers[i]=i+1;
		int[] result = new int[k];
		for (int i=0;i<result.length;i++)
		{
			int r = (int) (Math.random()*n);
			result[i]=numbers[r];
			
			numbers[r]=numbers[n-1];
			n--;
		}
		Arrays.sort(result);
		System.out.println("Bet the following numbers, it will make u rich");
		for (int r : result)
			System.out.println(r);
		

	}

}
