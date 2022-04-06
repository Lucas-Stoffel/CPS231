package Week3;

import java.util.ArrayList;
 public class Main { 
    public static void main(String[] args) {        
        //define new ArrayList and initialize it
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(5);
        numList.add(7);
        numList.add(9);
        //print the ArrayList
        System.out.println("Initial ArrayList:");
        System.out.println(numList);
         
        //use add method with index=0 to add elements to the beginning of the list
        numList.add(0, 3);
        numList.add(0, 1);
         
        System.out.println("ArrayList after adding elements at the beginning:");
        //print ArrayList
        System.out.println(numList);
    }
}
