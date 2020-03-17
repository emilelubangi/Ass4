
package Assign4;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {

    public static void main(String args[]){

        List<String> list = new ArrayList<String>();
        list.add("First Name: Emile");
        list.add("Surname: Lubangi");
        list.add("Status: Married");

        System.out.println("Please Check my Identity down below");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }




}
