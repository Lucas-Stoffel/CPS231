package Week3;

import java.util.ArrayList;

public class ArrayListSet {
    public static void main(String[] args) {
        
        // create and initialize colorsList
        ArrayList<String> colorsList = new ArrayList<String>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("White");
        
        // call get () method to retrieve value at index 2
        System.out.println("Entry at index 2 before call to set: " + colorsList.get(2));

        // replace the value at index 2 with new value
        colorsList.set(2, "Yellow");

        // print the value at index 2 again
        System.out.println("Entry at index 2 after call to set: " + colorsList.get(2));
    }
}
