package Week3;

import java.util.*;

class CityList2 {
    public static void main(String args[]) {
        // create an ArrayList
        ArrayList<String> city_List = new ArrayList<String>(Arrays.asList("Delhi", "Mumbai", "Chennai",
                "Kolkata", "Pune", "Hyderabad"));
        // print the list
        System.out.println("Initial ArrayList:" + city_List);

        // remove element at index 2
        city_List.remove(2);
        // print the list
        System.out.println("\nArrayList after removing element at index 2:" + city_List);

        // remove the element "Kolkata"
        city_List.remove("Kolkata");
        // print the list
        System.out.println("\nArrayList after removing element -> Kolkata:" + city_List);

        // create new list
        ArrayList<String> newCities = new ArrayList<String>(Arrays.asList("Delhi", "Hyderabad"));
        // call removeAll to remove elements contained in newCities list.
        city_List.removeAll(newCities);
        // print the list
        System.out.println("\nArrayList after call to removeAll:" + city_List);
    }
}
