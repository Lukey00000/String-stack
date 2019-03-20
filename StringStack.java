// A stack abstract data type that contains Strings. 
public class StringStack {

	private String[] stackOStrings;
	public int maxNumber;
	private int top = -1;  

	//Constructor for creating a new StringStack with a certain capacity.

	public StringStack(int capacity) {
		// TODO implement this
		//sets the value of the public int 'maxNumber' to that of capacity so that the value for 'capacity' can be used in other methods
		maxNumber = capacity;
		stackOStrings = new String[capacity];
	}
	
	//Puts the given String on top of the stack (if there is enough space).
	
	public boolean push(String s) {
		if (top >= (maxNumber-1)) {
			return false;
		}
		else {
			//pre-increments the next element of 'stackOStrings to be the string contained in 's'
			stackOStrings[++top] = s;
			return true;
		}
	}
	
	//Removes the String on top of the stack from the stack and returns it.

	public String pop() {
		//If top is less than zero than there are zero elements in the array so null is returned
		if(top<0) {
			return null;
		}
		else {
			//decrements s off of stackOStrings and returns that value
			String s = stackOStrings[top--];
			return s;
		}
	}
	

	//Returns the number of Strings in the stack.

	public int count() {
		//stackOStrings.length obtains the number of elements in the array stackOStrings, which is the number of strings in the array.
		int size = stackOStrings.length;
		return size;
	}
	
}

