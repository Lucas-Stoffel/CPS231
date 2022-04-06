package Week3;

import java.util.*;

class CityList {
    public static void main(String args[]) {
        
        // create an ArrayList
        ArrayList<String> city_List = new ArrayList<String>();
        
        // add elements to the ArrayList using add method
        city_List.add("Delhi");
        city_List.add("Mumbai");
        city_List.add("Chennai");
        city_List.add("Kolkata");
        
        // print the list
        System.out.println("Initial ArrayList:" + city_List);
        
        // add an element at index 1 using add method overload
        city_List.add(1, "NYC");
        
        // print the list
        System.out.println("\nrrayList after adding element at index 1:" + city_List);
        
        // define a second list
        ArrayList<String> more_Cities = new ArrayList<String>(Arrays.asList("Pune", "Hyderabad"));
        
        // use addAll method to add the list to ArrayList at index 4
        city_List.addAll(4, more_Cities);
        
        // print the list
        System.out.println("\nArrayList after adding list at index 4:" + city_List);
    }
}
