package Week3;

import java.util.ArrayList;

class ArrayListEmpty {
    public static void main(String[] args) {

        // create and initialize colorsList
        ArrayList<String> colorsList = new ArrayList<String>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("White");
        // print the ArrayList
        System.out.println("The ArrayList: " + colorsList);
        // call clear() nethod on ArrayList
        colorsList.clear();
        // check if ArrayList is empty using isEmpty() method
        System.out.println("Is ArrayList empty after clear ()? :" + colorsList.isEmpty());
    }
}
