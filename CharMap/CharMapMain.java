package CharMap;
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


	public static void strMap(String wordA, String wordB) {

		HashMap<Character, Character> mapping = new HashMap<>();


		if (wordA.length() > wordB.length()) {
			System.out.println("false");
			return;
		}
		int len = wordA.length();

		for(int i = 0; i < len; i++) {
			char charA = wordA.charAt(i);
			char charB = wordB.charAt(i);

			if (mapping.containsKey(charA)) {
				// fail because you cant have two same characters on the left map to anything
				System.out.println("false");
				return;
				// do ask if it's ok for there to be two duplicate mappings, like 1->A and then another 1->A
			}

			// If this key's value is any other key's value inn the hashmap, it's a fail
			Collection<Character> mapvalues = mapping.values();

			if (mapvalues.contains(mapping.get(charA))) {
				// fail because we already have something that maps to this value
				System.out.println("false");
				return;
			}

			mapping.put(charA, charB);

		}
		System.out.println("true");

	}

}
