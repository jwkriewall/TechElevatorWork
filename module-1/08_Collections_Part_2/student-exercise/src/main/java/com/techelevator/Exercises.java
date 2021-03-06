package com.techelevator;

import java.util.Map;
import java.lang.String;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		
		
		
		
		Map<String, String> animalGroupName = new HashMap<String, String>();
		
		animalGroupName.put("rhino", "Crash");
		animalGroupName.put("giraffe", "Tower");
		animalGroupName.put("elephant", "Herd");
		animalGroupName.put("lion", "Pride");
		animalGroupName.put("crow", "Murder");
		animalGroupName.put("pigeon", "Kit");
		animalGroupName.put("flamingo", "Pat");
		animalGroupName.put("deer", "Herd");
		animalGroupName.put("dog", "Pack");
		animalGroupName.put("crocodile", "Float");
		
		// populate Map
		
		// is animalName a key?
		// return key using .get()
		
		// .equalsIgnoreCase()
		if (animalName != null) {
		animalName = animalName.toLowerCase();
		
		if (animalGroupName.containsKey(animalName)){
			return animalGroupName.get(animalName);
			}
		}
		return "unknown";
	}

	/*
	 * Given a String item number (a.k.a. SKU), 
	 * return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {
		Map <String, Double> isItOnSale = new HashMap <String,Double>();
		isItOnSale.put("KITCHEN4001", 0.20);
		isItOnSale.put("GARAGE1070", 0.15);
		isItOnSale.put("LIVINGROOM", 0.10);
		isItOnSale.put("KITCHEN6073", 0.40);
		isItOnSale.put("BEDROOM3434", 0.60);
		isItOnSale.put("BATH0073", 0.15);
		
		if (isItOnSale.containsKey(itemNumber.toUpperCase())) {
			return isItOnSale.get(itemNumber);
		}
		return 0.00;
	}

	/*
	 * Modify and return the given Map as follows: 
	 * if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		Map <String, Integer> robPeterToPayPaul = new HashMap <String, Integer>();
		
		// determine if peter's money is > 0
		// determine if Paul's money < 1000
		// if true, transfer PetersMoney / 2 to Paul
		
		int petersBankAccount = peterPaul.get("Peter");
		int paulsBankAccount = peterPaul.get("Paul");
		int paulsTransfer = 0;
		
		if (peterPaul.get("Peter") > 0 && peterPaul.get("Paul") < 1000) {
			
			paulsTransfer = (petersBankAccount / 2);
			
			// if paul's transfer puts hisbank account at more than 1000, return 1000
			robPeterToPayPaul.put("Paul", paulsBankAccount + paulsTransfer);
			robPeterToPayPaul.put("Peter", petersBankAccount - paulsTransfer);
			return robPeterToPayPaul;
		}
		return peterPaul;
	}

	/*
	 * Modify and return the given Map as follows: 
	 * if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		
		// if peterPaul.get("Peter") >= 5000
		// if peterPaul.get("Paul") >= 10000
		// populate new array peterPaulPartnership equal to .25Paul's worth + .25Peter's worth.
		
		Map <String, Integer> peterPaulPartnership = new HashMap <String, Integer>();
		
		// if following conditions are met, modify the Map to include peterPaulPartnership
		// as well as updated values for peter key and paul key.
		if (peterPaul.get("Peter") >= 5000 && peterPaul.get("Paul") >= 10000) {
			// following int initializes Int variable that shows how much peter would give
			double peterGiving = (peterPaul.get("Peter") * 0.25);
			double paulGiving = (peterPaul.get("Paul") * 0.25);
			
			//next two lines update the peterPaul values at each Key by:
			// taking total and subtracting how much each gave.
			peterPaul.put("Peter", ((int) peterPaul.get("Peter") - (int) peterGiving));
			peterPaul.put("Paul", ((int) peterPaul.get("Paul") - (int) paulGiving));
			
			// fills the peterPaulPartnership Map with new Key and subsequent value
			peterPaulPartnership.put("PeterPaulPartnership", (int) (peterGiving + paulGiving));
			return peterPaulPartnership;
		}
		
		//expected map containing ["Peter"-><3750>]
		// map was [<PeterPaulPartnership=3750>]
		
		return peterPaul;
	}

	/*
	 * Given an array of non-empty Strings, 
	 * return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		
		Map <String, String> beginningAndEnding = new HashMap <String, String>();
	
		// compare against other Strings in array
		
		// if String is different
		// .put() letters into beginningAndEnding array
		
		for (String word : words) {
			if (word != beginningAndEnding.get(word) &&
					beginningAndEnding.get(word.substring(0,1)) != beginningAndEnding.get(word.substring(0,1))) {
				beginningAndEnding.put(word.substring(0,1), word.substring(word.length() - 2, word.length() - 1));
			}
		}
		return beginningAndEnding;
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {	
		Map<String, Integer> counter = new HashMap<>();
		// initialize a new map called counter that holds key String and Value Integer
		
		// for-each loop 
		// if the map counter contains the word, increase the value currentCount AND
		// .put the word with it's count into the array.
		// if no duplicate exists, .put word + 1
		for (String word : words) {
			if(counter.containsKey(word)) {
				int currentCount = counter.get(word);
					currentCount++;
					counter.put(word, currentCount) ;
			} else {
				counter.put(word, 1);
		}			
	}			
	return counter;
}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map <Integer, Integer> intCounts = new HashMap<Integer, Integer>();
		
		for (int i : ints) {
			// Does this exist in the map? 
				// Add values
			// Add the key with a value of (i)
			if (intCounts.containsKey(i)) {
				intCounts.put( i , intCounts.get(i)+1);
			}
			else {
				intCounts.put(i, 2);
			}
		}
		
		return intCounts;
	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map <String, Boolean> wordMultiple = new HashMap <String, Boolean>();
		
		for (String word : words) {
			if (wordMultiple.containsKey(word)) {
				wordMultiple.put(word, true);
			}
			else {
				wordMultiple.put(word, false);
			}
		}
		
		return wordMultiple;
	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse) {
			Map <String, Integer> consolidateInventory = new HashMap<String, Integer>();
			// for each loop on remote warehouse values, .put them into main warehouse
			// if a key is contained in main warehouse, add the result of the two values
			
			// I want to put all the keys / values into consolidatedInventory
			
			{
				
			}
			
		return null;
	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	
	// for each loop, turn each entry in the string into separate entry
	// iterate over each entry to find how many it contains
	public Map<String, Integer> last2Revisited(String[] words) {
		Map <String, Integer> last2 = new HashMap <String, Integer>();
		int count = 0;
		for (String word : words) {
			if (last2.containsKey(word.substring(word.length() - 3, word.length() - 1))) {
				// how can I check for each position in the string for the key?
				count++;
				last2.put(word,  count);
			}
		}
		return last2;
	}

}
