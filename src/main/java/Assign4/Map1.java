package Assign4;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main (String args[]) {

        Map <String, String>  map = new HashMap();
        map.put("myName", "Lubangi");
        map.put("Status", "Married");
        map.put("Occupation", "Student");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }




}
