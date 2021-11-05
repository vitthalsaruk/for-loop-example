import java.util.*;

public class ForLoopExample
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(); //9
		int b = in.nextInt(); //13
		String [] numString = {"","one","two","three","four","five","six","seven","eight","nine"};
		
		for(; a <= b ; a++) {
		    if(a <= 9)
		        System.out.println(numString[a]);
		    else if(a % 2 == 0)
		        System.out.println("even");
		    else   
		        System.out.println("odd");
		}
	}
}

