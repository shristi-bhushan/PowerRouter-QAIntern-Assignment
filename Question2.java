// Write a program to print two lists one containing only elements which had duplicates and one containing elements that did not have duplicates.
// [1,5,1,3,7,21,25,2,5,3,21]
// List-1 -[1,3,5,21]
// List-2 -[2,7,25]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] nums = {1, 5, 1, 3, 7, 21, 25, 2, 5, 3, 21};

        // Hash table to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // here calculating element frequencies
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.get(num, 0) + 1);
        }

        List<Integer> duplicates = new ArrayList<>();
        List<Integer> nonDuplicates = new ArrayList<>();

        // Putting elements into different lists (duplicates or nonDuplicates) based on frequency 
        for (int num : nums) {
            if (frequencyMap.get(num) > 1) {
                if (!duplicates.contains(num)) {
                    duplicates.add(num);
                }
            } else {
                if (!nonDuplicates.contains(num)) {
                    nonDuplicates.add(num);
                }
            }
        }

        // Now printing the two lists
        System.out.println("List-1: " + duplicates);
        System.out.println("List-2: " + nonDuplicates);
    }
}

