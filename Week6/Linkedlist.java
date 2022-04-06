package Week6;

import java.util.*;

public class Linkedlist {

    public static void main(String args[])
    {  
        //linked list of String objects
        LinkedList<String> linkedlist_num = new LinkedList<String>();  
        linkedlist_num.add("one");
        linkedlist_num.add("two");
        linkedlist_num.add("three");
        linkedlist_num.add("four");
        linkedlist_num.add("five");
        //iterate over the linked list to display contents
         
        System.out.println("The contents of the linked list are:");

        for(int i = 0; i < linkedlist_num.size(); i++){

            System.out.println(linkedlist_num.get(i));

        }

    }  
}  

    

