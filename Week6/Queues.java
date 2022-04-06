package Week6;

import java.util.*;

public class Queues {

    public static void main(String args[]) {
        PriorityQueue<String> color_queue = new PriorityQueue<String>();
        color_queue.add("red");
        color_queue.add("green");
        color_queue.add("blue");
        color_queue.add("cyan");
        color_queue.add("magenta");
        color_queue.add("yellow");
        System.out.println("Priority Queue elements:");
        System.out.println("head:" + color_queue.peek());
        System.out.println("Other elements in Priority Queue:");

        for(String str : color_queue ){
            System.out.println(str + " ");
        }
        
        System.out.println("\n");
        color_queue.remove();
        System.out.println("After removing element, new head:" + color_queue.element());
        System.out.println("\n");
        color_queue.poll();
        System.out.println("After removing another element, Priority Queue :");
        
        for(String str2 : color_queue ){
            System.out.println(str2 + " ");
        }
    }

}
