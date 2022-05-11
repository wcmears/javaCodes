import java.util.Arrays;
public class myTestArray{
		
		public static void main(String[] args) {
        
			 
			System.out.println("The array with added value is is " + Arrays.toString(myArray.insert(435)));
			System.out.println("The array with added value is is " + Arrays.toString(myArray.insert(45)));
			System.out.println("The array with added value is is " + Arrays.toString(myArray.insert(25)));
			System.out.println("The array with added value is is " + Arrays.toString(myArray.insert(51)));
			System.out.println("The array with added value is is " + Arrays.toString(myArray.insert(5221)));
			System.out.println("The array with added value is is " + Arrays.toString(myArray.insert(57)));
			System.out.println("The array with added value is is " + Arrays.toString(myArray.insert(435)));
			System.out.println("The values are all distinct:" + myArray.allDistinct());
			System.out.println("Largest in given array is " + myArray.findMax()); 
			System.out.println("Smallest in given array is " + myArray.findMin());
			System.out.println("The value found is " + myArray.find(5221));
			System.out.println("The sum is " + myArray.total());
			System.out.println("The average is " + myArray.average());
			System.out.println("Display:" + Arrays.toString(myArray.display()));
			System.out.println("The array with added value is is " + Arrays.toString(myArray.insert(511)));
			System.out.println("The value was contained and removed:" + myArray.remove(45));
			System.out.println("Display:" + Arrays.toString(myArray.display()));
			System.out.println("The max value removed was " +  myArray.removeMax());
			System.out.println("Display:" + Arrays.toString(myArray.display()));
			System.out.println("The min value removed was " + myArray.removeMin());
			System.out.println("The reversed array is " + Arrays.toString(myArray.reverseArray()));
			System.out.println("The values are all distinct:" + myArray.allDistinct());
			System.out.println("Display:" + Arrays.toString(myArray.display()));
		}
}
//javac myTestArray.java
//java myTestArray.java