import java.util.*;

/* Name: <your name>   Seat No: <your seat no> */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();            // keeps order, allows duplicates
        list.add("O"); list.add("O"); list.add("Override");

        Set<Integer> ids = new HashSet<>();               // no duplicates
        ids.add(7); ids.add(7); ids.add(9);

        HashMap<String, Integer> count = new HashMap<>(); // key -> value
        for (String s : list) {                           // advanced for loop
            count.put(s, count.getOrDefault(s, 0) + 1);
        }

        Stack<Integer> stack = new Stack<>();             // last in, first out
        stack.push(1); stack.push(2);

        Queue<Integer> queue = new LinkedList<>();        // first in, first out
        queue.offer(1); queue.offer(2);

        String out = "list  = " + list + "\n";
        out += "set   = " + ids + "  (size " + ids.size() + ")\n";
        out += "map O = " + count.get("O") + ", map Override = " + count.get("Override") + "\n";
        out += "stack pop = " + stack.pop() + ", queue poll = " + queue.poll() + "\n";

        Iterator<String> it = list.iterator();            // Iterator
        out += "iterator: ";
        while (it.hasNext()) {
            out += it.next() + " ";
        }
        System.out.println(out);
    }
}