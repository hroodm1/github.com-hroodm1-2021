package CharMap;
/**
 * 
 * <p> CharMapMain class <p>
 * 
 * <p> Description:  Determines if there is a one to character mapping between string 1 and string 2</p>
 * 
 * @author Henry Rood-Matza
 *
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class CharMapMain {





	public static void main(String[] args) {
		String wordOne;
		String wordTwo;
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter String one");
		wordOne = scnr.nextLine();
		System.out.println("Enter String two");
		wordTwo = scnr.nextLine();
		strMap(wordOne, wordTwo);
		scnr.close();





	}


	public static void strMap(String strA, String strB) {

		HashMap<Character, Character> mapping = new HashMap<>();


		if (strA.length() > strB.length()) {
			System.out.println("false");
			return;
		}
		int len = strA.length();

		for(int i = 0; i < len; i++) {
			char charA = strA.charAt(i);
			char charB = strB.charAt(i);

			if (mapping.containsKey(charA)) {
				System.out.println("false");
				return;
				// do ask if it's ok for there to be two duplicate mappings, like 1->A and then another 1->A
			}

			Collection<Character> mapvalues = mapping.values();

			if (mapvalues.contains(mapping.get(charA))) {
				System.out.println("false");
				return;
			}

			mapping.put(charA, charB);

		}
		System.out.println("true");

	}

}
