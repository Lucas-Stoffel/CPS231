package Week12;

import java.util.LinkedList;
import java.util.List;

public class Pair<T1, T2> {

    protected T1 first = null;
    protected T2 second = null;

    public Pair() {
    }

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public void setFirst(T1 first) {
        this.first = first;
    }

    public T2 getSecond() {
        return second;
    }

    public void setSecond(T2 second) {
        this.second = second;
    }

    public static void main(String[] args) {
        // Create a new Pair that uses a String and an Integer
        Pair<String, Integer> howManyCats = new Pair<String, Integer>();

        howManyCats.setFirst("cats");
        howManyCats.setSecond(Integer.valueOf(10));

        System.out.println("There are " + howManyCats.getSecond() + " "
                + howManyCats.getFirst() + " available.");

        // Just a sysout separator
        System.out.println("---------------------");

        // Create a new list of Pairs of String/Integer objects
        List<Pair<String, Integer>> inventory = new LinkedList<Pair<String, Integer>>();
        // Add 3 examples of String/Integer pairs
        inventory.add(new Pair<String, Integer>("dogs", Integer.valueOf(5)));
        inventory.add(howManyCats);
        inventory.add(new Pair<String, Integer>("birds", Integer.valueOf(12)));

        // Go through and print each one
        for (Pair<String, Integer> item : inventory) {
            System.out.println("There are " + item.getSecond() + " "
                    + item.getFirst() + " available.");
        }

        // Just a sysout separator
        System.out.println("---------------------");

        // Now let's use the convenience class we created below…
        List<InventoryItem> coolInventory = new LinkedList<InventoryItem>();
        InventoryItem someItem = new InventoryItem("something", 5);
        coolInventory.add(someItem);
        coolInventory.add(new InventoryItem("sandwich", 3));

        InventoryItem changed = new InventoryItem(null, 0);
        changed.setName("pencil");
        changed.setQuantity(7);
        coolInventory.add(changed);

        for (InventoryItem item : coolInventory) {
            System.out.println("There are " + item.getQuantity() + " units of "
                    + item.getName() + " available.");
        }
    }

    public static class InventoryItem extends Pair<String, Integer> {

        public InventoryItem(String name, int quantity) {
            super.first = name;
            super.second = Integer.valueOf(quantity);
        }

        public void setName(String itemName) {
            super.first = itemName;
        }

        public String getName() {
            return super.first;
        }

        public void setQuantity(int itemQuantity) {
            super.second = Integer.valueOf(itemQuantity);
        }

        public int getQuantity() {
            return super.second.intValue();
        }
    }
}
