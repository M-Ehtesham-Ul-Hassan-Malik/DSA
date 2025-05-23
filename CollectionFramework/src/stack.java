import java.util.Stack;

public class stack {

    public static void main(String[] args) {

        //initialed the stack
        Stack<String> names = new Stack<>();

        // It follows LIFO approach means Last In First Out

        // push() function: it push the value/item into the stack
        names.push("Ehtesham");
        names.push("Amjad");
        names.push("Ahsan");
        names.push("Akber");

        System.out.println("Stack: "+names); // Stack: [Ehtesham, Amjad, Ahsan, Akber]

        // peek() function: It returns the top item/element/value of the stack

        System.out.println(names.peek()); // Akber: because of LIFO

        // pop() function: It deletes the Last entered value from the stack

        names.pop(); // remove akber from the stack
        System.out.println("stack: "+names); // stack: [Ehtesham, Amjad, Ahsan]
        System.out.println(names.peek()); // Ahsan

    }
}
