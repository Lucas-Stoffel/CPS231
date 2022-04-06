package Week6;

import java.util.*;

public class Vectors {

    public static void main(String args[]) {
        Vector<String> subject_vector = new Vector<String>();
        subject_vector.add("English");
        subject_vector.add("Hindi");
        subject_vector.add("Maths");
        subject_vector.add("Science");

        System.out.println("Vector contents:");
        for (int i = 0; i < subject_vector.size(); i++) {
            System.out.println(subject_vector.get(i));
        }
    }

}
