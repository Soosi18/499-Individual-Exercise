import java.util.*;

public class CheckRepeating {

	public static void main(String[] args) {
		
		//declare and initialize 'letters' array with random values
		char[] letters = new char[5];
		Random r = new Random();
		
		for(int i = 0; i < letters.length; i++) {
			letters[i] = (char) (r.nextInt(26) + 'a');
		}
		
		//print contents of letters array
		System.out.println("letters Array: " + Arrays.toString(letters) + "\n\n");
		
		//print results of checkRepeatingLetter() method
		System.out.println("Is there a repeating alphabet in the letters Array? : " + (checkRepeatingLetter(letters) ? "Yes" : "No"));
	}
	
	
	//sort array and check if any letter repeats in the array. If yes, returns true, otherwise returns false.
	public static boolean checkRepeatingLetter(char[] letters) {
		Arrays.sort(letters);
		for(int i = 0; i < letters.length - 1; i++) {
			if(letters[i] == letters[i+1]) {
				return true;
			}
		}
		return false;
	}
	
}
