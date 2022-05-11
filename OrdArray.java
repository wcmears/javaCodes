public class OrdArray {
	public static int[] OrdArray = new int[5];
	public static int[] insert(int value){
		//Initializes i to be 0 and integer
		int i = 0;
		//Runs while i is less than length of the array,
		while (i < OrdArray.length){
			//Adds value to any empty spot in array and breaks 
			//loop if value is added
			if (OrdArray[i] == 0){
				OrdArray[i] = value;
				break;
			}
			//Rotates through each i
			i++;
		}
		//Sets k to zero, goes through as long as k is less than array length,
		//and adds 1 to k each time through, sets j to k
		for(int k=0; k < OrdArray.length; k++){ 
			int j = k; 
			//Cycles through each j and replaces element at index j with previous
			//element if previous element is greater than the next element
			while(j > 0 && OrdArray[j-1]>OrdArray[j]){
				int key = OrdArray[j];
				OrdArray[j] = OrdArray[j-1];
				OrdArray[j-1] = key;
				j = j-1; 
			}
		}
	//Returns array
	return OrdArray;
	}
	public static boolean find(int value){
		//Initializes test as false, low to smallest value in array, mid to
		//middle array value, high to largest array value, and i to mid so 
		//binary search can start in the middle of the array
		boolean test = false;
		int low = 0;
		int mid = (OrdArray.length-1)/2;
		int high = OrdArray.length-1;
		int i = mid;
		//Sets loop to be less than length of array
		while (i < OrdArray.length){
			//Makes test true if element at highest index is equivalent to the value,
			//otherwise breaks loop.
			if (i == high) {
				if (OrdArray[high] == value){
					test = true;
					break;
				}
				else{
					break;
				}
			}
			//Makes test true if element at lowest index is equivalent to the value,
			//otherwise breaks loop.
			else if (i == low) {
				if (OrdArray[low] == value){
					test = true;
					break;
				}
				else{
					break;
				}
			}
			//Stops loop if the value is inbetween any two elements in the array
			//while counting down
			if (OrdArray[i-1] < value && value < OrdArray[i]){
					break;
			}
			//Stops loop if the value is inbetween any two elements in the array
			//while counting up
			else if (OrdArray[i+1] > value && value > OrdArray[i]){
					break;
			}
			//Moves on to next greatest value in the array if current index i
			// is smaller than value
			else if (value > OrdArray[i]){
				i=i+1;
			}
			//Moves on to next smallest value in the array if current index i
			// is greater than value
			else if (value < OrdArray[i]){
				i=i-1;
			}
			//breaks loop and returns true if value is not inbetween two elements,
			//greater than the element in the index or less than the element
			else{
				test = true;
				break;
			}
		}
	//returns true or false
	return test;
	}
	public static boolean remove(int value){
		//Initializes test as false, low to smallest value in array, mid to
		//middle array value, high to largest array value, and i to mid so 
		//binary search can start in the middle of the array
		boolean test = false;
		int low = 0;
		int mid = (OrdArray.length-1)/2;
		int high = OrdArray.length-1;
		int i = mid;
		//Sets loop to be less than length of array
		while (i < OrdArray.length){
			//Makes test true if element at highest index is equivalent to the value,
			//otherwise breaks loop.
			if (i == high) {
				if (OrdArray[high] == value){
					test = true;
					OrdArray[i] = 0;
					break;
				}
				else{
					break;
				}
			}
			//Makes test true if element at lowest index is equivalent to the value,
			//otherwise breaks loop.
			else if (i == low) {
				if (OrdArray[low] == value){
					test = true;
					OrdArray[i] = 0;
					break;
				}
				else{
					break;
				}
			}
			//Stops loop if the value is inbetween any two elements in the array
			//while counting down
			if (OrdArray[i-1] < value && value < OrdArray[i]){
					break;
			}
			//Stops loop if the value is inbetween any two elements in the array
			//while counting up
			else if (OrdArray[i+1] > value && value > OrdArray[i]){
					break;
			}
			//Moves on to next greatest value in the array if current index i
			// is smaller than value
			else if (value > OrdArray[i]){
				i=i+1;
			}
			//Moves on to next smallest value in the array if current index i
			// is greater than value
			else if (value < OrdArray[i]){
				i=i-1;
			}
			//breaks loop and returns true if value is not inbetween two elements,
			//greater than the element in the index or less than the element
			else{
				test = true;
				OrdArray[i] = 0;
				break;
			}
		}
		//Ordered sort code from insert
		for(int k=0; k < OrdArray.length; k++){ 
			int j = k; 
			
			while(j > 0 && OrdArray[j-1]>OrdArray[j]){
				int key = OrdArray[j];
				OrdArray[j] = OrdArray[j-1];
				OrdArray[j-1] = key;
				j = j-1; 
			}
		}
	//returns true or false
	return test;
	}
	public static void sort(){
		//Sets i to zero, goes through as long as i is less than array length,
		//and adds 1 to i each time through, sets j to i
		for(int i=0;i<OrdArray.length;++i){ 
			int j = i;
			//Cycles through each j and replaces element at index j with previous
			//element if previous element is greater than the next element
			while(j > 0 && OrdArray[j-1]>OrdArray[j]){
				int key = OrdArray[j];
				OrdArray[j] = OrdArray[j-1];
				OrdArray[j-1] = key;
				j = j-1; 
			}
		}
	}
	public static int[] display(){
		//Prints elements of array
		return OrdArray;
	}
}