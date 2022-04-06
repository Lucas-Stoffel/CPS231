package Week3;

import java.util.ArrayList;

public class ArrayListSize {
    public static void main(String[] args) {
        
        // Create and initialize Arraylist
        ArrayList<Integer> evenList = new ArrayList<Integer>(5);
        System.out.println("Initial size: " + evenList.size());
        evenList.add(2);
        evenList.add(4);
        evenList.add(6);
        evenList.add(8);
        evenList.add(10);
        
        // print the list and size
        System.out.println("Original List: " + evenList);
        System.out.println("ArrayList Size after add operation: " + evenList.size());
        
        // call ensureCapacity () with minimum capacity =10
        evenList.ensureCapacity(10);
        
        // add two more elements
        evenList.add(12);
        evenList.add(14);
        
        // print the size again
        System.out.println("ArrayList Size after ensureCapacity() call and add operation: " + evenList.size());
        
        // call trimToSize()
        evenList.trimToSize();
        
        // print the size and the ArrayList
        System.out.println("ArrayList Size after trimToSize() operation: " + evenList.size());
        System.out.println("ArrayList final: ");
        for (int num : evenList) {
            System.out.print(num + " ");
        }
    }
}
