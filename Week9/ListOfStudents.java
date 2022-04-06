package Week9;

import java.io.*;
import java.util.*;

/**
 * 
 */

public class ListOfStudents {

    public static void main(String[] args) throws IOException {

        ArrayList<String> students = nameList();

        printArray(students);

    }

    public static void printArray(ArrayList<String> str) {

        int index = 1;
        for (String s : str){
            //System.out.println("ID #:" + Integer.toBinaryString((index++)) + " -- " + s);
            System.out.printf("ID #: %05d -- %s\n", Integer.parseInt(Integer.toBinaryString(index + 16)), s);
            index++;
        }

    }

    public static ArrayList<String> nameList() throws IOException {
        ArrayList<String> names = new ArrayList<String>();

        Scanner infile = new Scanner(new File("C:/Users/HpSpectre/Desktop/CPS 3 Work/Week9/ClassNames2.txt"));
        while (infile.hasNext()) {
            names.add(infile.nextLine());
        }

        infile.close();
        return names;
    }

}
