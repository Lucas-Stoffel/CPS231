package Week3;

import java.util.ArrayList;

public class ArrayListContains {
    public static void main(String[] args) {

        // create and initialize colorsList
        ArrayList<String> colorsList = new ArrayList<String>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add("White");

        // call contains method to check if different strings are present in ArrayList
        System.out.println("ArrayList contains ('Red Green'): "
                + colorsList.contains("Red Green"));
        System.out.println("ArrayList contains ('Blue'): "
                + colorsList.contains("Blue"));
        System.out.println("ArrayList contains ('Yellow'): "
                + colorsList.contains("Yellow"));
        System.out.println("ArrayList contains ('White'): "
                + colorsList.contains("White"));
    }
}
