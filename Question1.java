//Write a program to find the middle character of a palindrome formed by the following list. Examples:
//                     [a,m,m, a,d]      -> madam       	return: d
//                     [i,i,e,d,e,r,d,r,v] -> redivider		return: v

import java.util.HashMap; 
import java.util.Map;

public class PalindromeMidChar {
    public static Character findMiddleCharacter(Character[] arr) {
        Map<Character, Integer> frequency = new HashMap<>();

        // Here calculating character frequencies
        for (Character c : arr ) {
            Integer charCount = frequency.get(c);
            if ( charCount == null) {
                  charCount = 0;
     }
               frequency.put(c, charCount + 1);   // incrementing char count 
        }

        // to get the middle character 
        for (Character c : arr) {
            if (frequency.get(c) % 2 != 0) { // checking for the odd frequency (char with no pair) 
                return c;
            }
        }

        return null; // No middle character found
    }

            public static void main(String[] args) {
                Character[] arr1 = {'a', 'm', 'm', 'a', 'd'};
                System.out.println(findMiddleCharacter(arr1));  // Output: d

                Character[] arr2 = {'i', 'i', 'e', 'd', 'e', 'r', 'd', 'r', 'v'};
                System.out.println(findMiddleCharacter(arr2));  // Output: v
            }
}

