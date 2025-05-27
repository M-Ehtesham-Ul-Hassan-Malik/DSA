import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args)
    // TreeSet follows set properties, but it maintains the elements in sorted order.

/*
Time Complexities of TreeSet operations:
- add(): O(log n)
- remove(): O(log n)
- contains(): O(log n)
- isEmpty(): O(1)
- clear(): O(n)

*/
        Set<Integer> set = new TreeSet<>();

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
