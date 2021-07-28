/*  Algorithm:
1. we have to declare a string
2. hashmap declaration syntax
3. we have to check every word so we have key and value
4. to be or not to be  // key-to value:1 check
5.we have to create an array for storing values or output.
6. split method in hashmap used split() method breaks a given string around matches of the given regular expression.
7.regex – the delimiting regular expression
8.Split the given string and store the words into a String array.
9.
*/

import java.util.HashMap;
import java.util.Map;

class MyHashmapTest {
    public static void main(String[] args)
    {

        // Declaring the String
        String str = "To be or not to be";
        // Declaring a HashMap of <String, Integer>
        Map<String, Integer> hashMap = new HashMap<>();

        // Splitting the words of string
        // and storing them in the array.
        String[] words = str.split(" ");

        for (String word : words) {

            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer integer = hashMap.get(word);

            if (integer == null)
                // Storing the word as key and its occurrence as value in the HashMap.
                hashMap.put(word, 1);

            else {
                // Incrementing the value if the word
                // is already present in the HashMap.
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}