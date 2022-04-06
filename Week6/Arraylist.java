package Week6;

import java.util.*;

public class Arraylist {

    public static void main(String args[]) {
        // Creating arraylist of String objects
        ArrayList<String> color_list = new ArrayList<String>();
        // populate the arraylist with add method
        color_list.add("Red");
        color_list.add("Green");
        color_list.add("Blue");
        color_list.add("Cyan");
        color_list.add("Magenta");
        color_list.add("Yellow");
        
        System.out.println("The contents of the arraylist are:");
        for (int i = 0; i < color_list.size(); i++) {
            System.out.println(color_list.get(i));
        }
    }

}
