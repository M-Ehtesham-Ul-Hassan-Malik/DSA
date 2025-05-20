import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {


    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Ehtesham");
        students.add("Amjad");
        System.out.println(students); // [Ehtesham, Amjad]

// size = n
//        n = n+n/2 +1

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        System.out.println(l1); //[1, 2]

        l1.add(3); // add function put the value in the last index
        System.out.println(l1); //[1, 2, 3]

        l1.add(1,200);  // giving the index no we can assign value on particular index
                                    // 200 will be added at index 1
        System.out.println(l1); //[1, 200, 2, 3]

        List<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(20);
        System.out.println(l2); //[10, 20]

        // addAll() function copy the all elements from one list to another
        l1.addAll(l2);
        System.out.println(l1); //[1, 200, 2, 3, 10, 20]


        //get() function will return the value from the specific index
        System.out.println(l1.get(1)); //200

        //remove() function
        System.out.println(l1); //[1, 200, 2, 3, 10, 20]
        l1.remove(4);// this will remove the value from the provided index 4 i.e: 10
        System.out.println(l1); // [1, 200, 2, 3, 20]

        l1.remove(Integer.valueOf(200)); // this will remove the type of value passed
        System.out.println(l1); //[1, 2, 3, 20]

        // clear() function => remove all the elements form the list
        System.out.println(l1);  //[1, 2, 3, 20]
        l1.clear(); // this will remove all the elements form the list l1
        System.out.println(l1); // []

        // set() function => updates the value of the particular index
        System.out.println(l2); // [10, 20]
        l2.set(0,100);  // l2.set(index, updated_Value)
        System.out.println(l2); // [100, 20]

        // contain() function => check whether the value exist in the list or not. It returns true or false.
        System.out.println(l2.contains(100)); // true
        System.out.println(l2.contains(786)); // false

        // .size() function
        for (int i = 0; i < l2.size(); i++) {
            System.out.println(l2.get(i));
        }





    }
}
