package Week4;

import java.util.*;
import java.io.*;

class Investment {
    public static void main(String[] args) throws IOException {

        ArrayList<String> names = nameList();
        ArrayList<Integer> balances = balanceList();


        printArray(names, balances);
        getHighestBal(names, balances);
        getSecondHighestBal(names, balances);

    }

    public static ArrayList<String> nameList() throws IOException {
        ArrayList<String> names = new ArrayList<String>();

        Scanner infile = new Scanner(new File("C:/Users/HpSpectre/Desktop/CPS 3 Work/Week4/names.txt"));
        while (infile.hasNext()) {
            names.add(infile.nextLine());
        }

        infile.close();
        return names;
    }

    public static ArrayList<Integer> balanceList() throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner s = new Scanner(new File("C:/Users/HpSpectre/Desktop/CPS 3 Work/Week4/balances.txt"));
        while (s.hasNextInt()) {
            list.add(Integer.parseInt(s.nextLine()));
        }
        s.close();
        return list;
    }

    public static void printArray(ArrayList<String> str, ArrayList<Integer> arr) {

        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i) + ": $" + arr.get(i));
        }

    }

    public static void getHighestBal(ArrayList<String> str, ArrayList<Integer> arr) {

        int max = Collections.max(arr);
        int index = arr.indexOf(max);

        System.out.println("<------------------------------------------>");
        System.out.println("Highest Balance:");
        System.out.println(str.get(index) + ": $" + max);

    }

    public static void getSecondHighestBal(ArrayList<String> str, ArrayList<Integer> arr) {

        int max = Collections.max(arr);
        int index = arr.indexOf(max);
        arr.remove(index);
        str.remove(index);

        int max2 = Collections.max(arr);
        int index2 = arr.indexOf(max2);

        System.out.println("<------------------------------------------>");
        System.out.println("2nd Highest Balance:");
        System.out.println(str.get(index2) + ": $" + max2);

    }

}