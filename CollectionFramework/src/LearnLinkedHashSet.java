import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {

        // Hashset follows set properties, but it maintains the insertion order.
/*
LinkedHashSet Time Complexity w.r.t its operations:

- add(): O(1) (average case), O(n) (worst case)
- remove(): O(1) (average case), O(n) (worst case)
- contains(): O(1) (average case), O(n) (worst case)
- isEmpty(): O(1)
- clear(): O(n)

 */
        Set<Integer> set = new LinkedHashSet<>();

        // add() function adds the values in the set
        set.add(11);
        set.add(32);
        set.add(23);
        set.add(47);
        set.add(51);
//        for (int i = 100; i >= 1; i--) {
//            set.add(i);
//        }

        System.out.println(set); //[32, 51, 23, 11, 47]

        // it will not add the duplicates

        set.add(32); // 32 is already in the set: [32, 51, 23, 11, 47]
        System.out.println(set); //[32, 51, 23, 11, 47] no changes

//        remove() function used to remove value from set
        System.out.println(set.remove(51)); // true => This is because the remove method in Java's HashSet class returns a boolean value indicating whether the element was successfully removed from the set.
        System.out.println(set); //[32, 23, 11, 47]

//        contain() function check the value in the set, and return the answer in boolean
        System.out.println(set.contains(11)); // true
        System.out.println(set.contains(404));// false

//        isEmpty() function checks whether the set is empty or not.
        System.out.println(set.isEmpty()); //false

//        clear() function makes the set empty from all the values
        set.clear();
        System.out.println(set); //[]

        System.out.println(set.isEmpty()); //true
    }
}
