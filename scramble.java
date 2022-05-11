import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class scramble{
	public static String randomize( Random random, String inputString ){
    
		char a[] = inputString.toCharArray();

		for( int i=0 ; i<a.length ; i++ ){
			int j = random.nextInt(a.length);
			char temp = a[i]; a[i] = a[j];  a[j] = temp;
		}       

		return new String( a );
	}
}