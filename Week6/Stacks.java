package Week6;

import java.util.*;

public class Stacks {
    
    public static void main(String args[])
    {  
        Stack<Integer> even_stack = new Stack<Integer>();  
       even_stack.push(2);  
       even_stack.push(4);  
       even_stack.push(6);  
       even_stack.push(8);  
       even_stack.push(10);  
       System.out.println("The element removed from stack: " + even_stack.pop());    
       System.out.println("The contents of the stack are:");
       
       for(int i = 0; i < even_stack.size(); i++)
       {  
              System.out.print(even_stack.get(i) + " ");  
        }  
    }  

}
