package exp_1;
import java.util.Arrays;
import java.util.Collections;

public class Exp_1k {

	public static void main(String[] args) {
		Integer[] num = {2, 4, 7, 5, 9};
		
		int min = Collections.min(Arrays.asList(num));
		int max = Collections.max(Arrays.asList(num));
		
		System.out.println("Minimum number of array is : " + min);
		System.out.println("Maximum number of array is : " + max);
	}

}
