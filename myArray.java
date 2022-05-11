public class myArray {
	//Sets array equal to certain size
	public static int[] myArray = new int[0];
	public static int findMax(){ 
		//Goes through if array is not empty
		if (myArray.length > 0){
			//Initializes i and max as integers and sets max equal to the first
			//the first element in the array.
			int i; 
			int max = myArray[0]; 
			//Sets i to one, goes through as long as i is less than array length,
			//and adds 1 to i each time through.
			for (i = 1; i < myArray.length; i++){
				//Starting at one, cycles through each element in the array and 
				//changes max if element at index is greater than all previous elements
				if (myArray[i] > max){ 
					max = myArray[i]; 
				}
			}
		//returns max value
        return max; 
		}
		//returns -1 if array is empty
		else return -1;
	}
	public static int findMin(){ 
		//Goes through if array is not empty
		if (myArray.length >0){
			//Initializes i and min as integers and sets min equal to
			//the first element in the array.
			int i; 
			int min = myArray[0]; 
			//Sets i to one, goes through as long as i is less than array length,
			//and adds 1 to i each time through.
			for (i = 1; i < myArray.length; i++){ 
				//Starting at one, cycles through each element in the array and 
				//changes min if element at index is less than all previous elements
				if (myArray[i] < min){ 
					min = myArray[i]; 
				}
			}
		//returns minimum value
		return min; 
		} 
	//returns -1 if array is empty
	else return -1;
	}
	public static boolean find(int value){ 
		//Initializes test and sets it to be false, also intializes
		//integer i
		boolean test = false; 
		int i;
		//Starting at zero, cycles through each element in the array and 
		//changes min if element at index is less than all previous elements
        for (i=0; i < myArray.length; i++){ 
			//Value is found, and test is true, if the value being searched for
			//is equivalent to the element at index i
            if (myArray[i] == value) { 
                test = true; 
            } 
        }
	//returns test
	return test;
	}	
	public static int total(){
		//initializes total to 0 and i as an integer
		int total = 0;
		int i;
		//Starting at zero, cycles through each element in the array and 
		//changes min if element at index is less than all previous elements
		for(i = 0; i < myArray.length; i++){
			//adds each index to sum of every previous index
			total = total+myArray[i];
		}
	//returns total
	return total;
	}
	public static double average(){
		//Only runs if array has elements, as you cannot divide by zero
		if (myArray.length > 0){
			//sets average as a double type, sets average equivalent
			//to total divided by length of array, returns average
			double average;
			average = total()/myArray.length;
			return average;
		}
		//returns 0 if there are no elements in the array
		else return 0;
	}
	public static int[] insert(int value){
		//Initializes i to be 0 and integer
		int i = 0;
		//Runs while i is less than length of the array,
		while (i < myArray.length){
			//Adds value to any empty spot in array and breaks 
			//loop if value is added
			if (myArray[i] == 0){
				myArray[i] = value;
				break;
			}
			//Rotates through each i
			i++;
		}
	//Returns array
	return myArray;
	}
	public static boolean remove(int value){ 
		//Initializes test and sets it to be false
		boolean test = false;
		//Sets i to zero, goes through as long as i is less than array length,
		//and adds 1 to i each time through.
		for(int i = 0; i < myArray.length; i++){
			//Makes value empty if value is found while going through i
			//and returns true
			if(myArray[i] == value) {
				myArray[i] = 0;
				test = true;
			}
		}
	//returns test
	return test;
	}
	public static int removeMax(){
		//Goes through if array is not empty    
		if (myArray.length > 0){
			//Initializes i, j, max as integers and sets max equal to
			//the first element in the array.
			int i; 
			int j;
			int max = myArray[0]; 
			//Sets i to one, goes through as long as i is less than array length,
			//and adds 1 to i each time through.
			for (i = 1; i < myArray.length; i++){
				//Starting at one, cycles through each element in the array and 
				//changes max if element at index is greater than all previous elements
				if (myArray[i] > max){
					max = myArray[i]; 
				}
			}
			//Sets j to zero, goes through as long as j is less than array length,
			//and adds 1 to j each time through.
			for(j = 0; j < myArray.length; j++){
				//Searches for the max value through the array and changes
				//the value so it is empty
				if(myArray[j] == max) {
					myArray[j] = 0;
				}
			}
		//Returns the maximum value that was removed from the code
		//This is the reason why I  didnt just set max to be 0
		//in my first for loop
        return max; 
		}
	//returns -1 if array is empty
	else return -1;
	}
	public static int removeMin() {
		//Goes through if array is not empty    
		if (myArray.length > 0){
			//Initializes i, j, min as integers and sets min equal to
			//the first element in the array.
			int i; 
			int j;
			int min = myArray[0];
			//Sets i to one, goes through as long as i is less than array length,
			//and adds 1 to i each time through.
			for (i = 1; i < myArray.length; i++){ 
				//Starting at one, cycles through each element in the array and 
				//changes min if element at index is less than all previous elements
				if (myArray[i] < min){ 
					min = myArray[i]; 
				}
			}
			//Sets j to zero, goes through as long as j is less than array length,
			//and adds 1 to j each time through.
			for(j = 0; j < myArray.length; j++){
				//Searches for the min value through the array and changes
				//the value so it is empty
				if(myArray[j] == min){
					myArray[j] = 0;
				}
			}
		//returns minimum value
        return min; 
		}
	//returns -1 if array is empty
	else return -1;
	}
	public static int[] reverseArray(){
		//Initializes reverse, start, and end as integers
		//Sets start equivalent to zero and end equivalent to one less
		//than array length
		//initializes array as new array the same length of the original array
		int reverse;
		int start = 0;
		int end = (myArray.length-1);
	    int array[] = new int[myArray.length]; 
		//Sets i to zero, goes through as long as i is less than array length,
		//and adds 1 to i each time through.
        for (int i=0; i<myArray.length; i++){
			//Copies all elements of original array tp new array
            array[i] = myArray[i]; 
		}
		//Changes the first element in the array to be the last elements
		//and the last element to be the first element, and repeats the 
		//process for index' 1 and length-2, 2 and length-3, etc.
        while (start < end){
            reverse = array[start]; 
            array[start] = array[end];
            array[end] = reverse;
            start++;
            end--;
        }
	//returns the array
	return array;
    }     
	public static boolean allDistinct() {
		//Sets i to zero, goes through as long as i is less than array length-1,
		//and adds 1 to i each time through. Loop goes through each value at index
		//j to make sure that none of the values are the same as each value at 
		//index i
		for (int i = 0; i < myArray.length-1; i++){
			//Sets j to zero, goes through as long as j is less than array length,
			//and adds 1 to j each time through.
			for (int j = i+1; j < myArray.length; j++){
				//Test is false if any value at index j is equivalent to any
				//value at index i
				if (myArray[i] == myArray[j]){
					return false;
				}
			}
		}        
	//Returns true if all values are distinct
    return true;            
	}
	public static int[] display() {
		//Returns array
		return myArray;
	} 
 }