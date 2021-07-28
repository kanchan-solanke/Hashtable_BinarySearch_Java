
import hashmap.MymapNode;

import java.util.*;

public class HashmapUC2 {


    public static void main(String[] args) {
//create hashmap
        Hashmap<Integer, String> lhmap = new Hashmap<Integer, String>();

        //index all words in para

        lhmap.put(1, "Paranoids");
        lhmap.put(2, "are");
        lhmap.put(3, "not");
        lhmap.put(4, "paranoid");
        lhmap.put(5, "because");
        lhmap.put(6, "they");
        lhmap.put(7, "are");
        lhmap.put(8, "not");
        lhmap.put(9, "paranoid");
        lhmap.put(10, "but");
        lhmap.put(11, "because");
        lhmap.put(12, "they");
        lhmap.put(13, "keep");
        lhmap.put(14, "putting");
        lhmap.put(15, "themselves");
        lhmap.put(16, "deliberately");
        lhmap.put(17, "into");
        lhmap.put(18, "paranoid");
        lhmap.put(19, "avoidable");
        lhmap.put(20, "situations");

                   /*
                    * Get all keys from the
                    * using the keySet method
                    * keySet() method in Java is used to create a set out of the key
                    elements contained in the hash map.
                    * Parameters: The method does not take any parameter.
                      Return Value: The method returns a set having the keys of the hash map.
                    */
        Set<Integer> keys = lhmap.keySet();

        /*
         * create Linkedlist of MymapNode
         */
        MymapNode<Integer, String> listKeys = new MymapNode<Integer, String>(keys);

        /*
         * Find index using indexOf method.
         * It returns -1 if key is not found
         */
        System.out.println("Index of key 1 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(1));
        System.out.println("Index of key 2 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(2));
        System.out.println("Index of key 3 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(3));
        System.out.println("Index of key 4 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(4));
        System.out.println("Index of key 5 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(5));
        System.out.println("Index of key 6 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(6));
        System.out.println("Index of key 7 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(7));
        System.out.println("Index of key 8 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(8));
        System.out.println("Index of key 9 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(9));
        System.out.println("Index of key 10 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(10));
        System.out.println("Index of key 11 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(11));
        System.out.println("Index of key 12 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(12));
        System.out.println("Index of key 13 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(13));
        System.out.println("Index of key 14 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(14));
        System.out.println("Index of key 15 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(15));
        System.out.println("Index of key 16 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(16));
        System.out.println("Index of key 17 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(17));
        System.out.println("Index of key 18 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(18));
        System.out.println("Index of key 19 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(19));
        System.out.println("Index of key 20 is: " + ((MymapNode<Integer, String>) listKeys).indexOf(20));

    }

    public static class Hashmap<T, T1> {
        public void put(T i, T1 paranoids) {
        }

        public Set<Integer> keySet() {
            return null;
        }
    }
}