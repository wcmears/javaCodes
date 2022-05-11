import java.util.Arrays;
public class myTestOrdArray{
		public static void main(String[] args) {
			
			System.out.println("The array with added value is is " + Arrays.toString(OrdArray.insert(10)));
			System.out.println("The array with added value is is " + Arrays.toString(OrdArray.insert(21)));
			System.out.println("The array with added value is is " + Arrays.toString(OrdArray.insert(20)));
			System.out.println("The array with added value is is " + Arrays.toString(OrdArray.insert(300)));
			System.out.println("The array with added value is is " + Arrays.toString(OrdArray.insert(10)));
			System.out.println("The array with added value is is " + Arrays.toString(OrdArray.insert(1)));
			System.out.println("The array with added value is is " + Arrays.toString(OrdArray.insert(70)));
			System.out.println("The value was found:" + OrdArray.find(21));
			System.out.println("The array is" + Arrays.toString(OrdArray.display()));
			System.out.println("The value was found and removed:" + OrdArray.remove(10));
			System.out.println("The array is" + Arrays.toString(OrdArray.display()));
		}
}
//javac myTestOrdArray.java
//java myTestOrdArray.java