import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class LearnHashMap {
    public static void main(String[] args) {
//      Map<KeyType, ValueType> name = new HashMap<>();
        Map<String, String> hm = new HashMap<>();

        //Keys are the unique identifier for each element.
        //Values are the data associated with each key.

        /* map is the data structure that store key-value pairs in a way that allows
        for efficient lookup, insertion, deletion of elements.
        It stores data in a random order, it does not maintain the sequence.
         */

        //Insertion
        hm.put("22K-4824", "M Ehtesham Ul Hassan Malik");
        hm.put("22K-4809", "Munawar Shereen");
        hm.put("22k-5179", "Huzaifa Faran");

        System.out.println(hm); //{22K-4824=M Ehtesham Ul Hassan Malik, 22k-5179=Huzaifa Faran, 22K-4809=Munawar Shereen}

        hm.put("22K-4809","Munawar Khan"); //this will update the value of the already present key 22k-4809
        System.out.println(hm); //{22K-4824=M Ehtesham Ul Hassan Malik, 22k-5179=Huzaifa Faran, 22K-4809=Munawar Khan}

        //search by key
        if(hm.containsKey("22K-4824")){
            System.out.println("Key Present");
        }else {
            System.out.println("Key Absent");
        }

        //get the value through key
        System.out.println(hm.get("22K-4824")); //M Ehtesham Ul Hassan Malik
        System.out.println(hm.get("22K-2024")); //null

//        //iteration of value in the map
        for(Map.Entry<String, String> e: hm.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //removing value from the map
        System.out.println(hm);// {22K-4824=M Ehtesham Ul Hassan Malik, 22k-5179=Huzaifa Faran, 22K-4809=Munawar Khan}
        hm.remove("22k-5179");
        System.out.println(hm); //{22K-4824=M Ehtesham Ul Hassan Malik, 22K-4809=Munawar Khan}

        // clearing all values from the map
        hm.clear();
        System.out.println(hm);//{}


    }
}
