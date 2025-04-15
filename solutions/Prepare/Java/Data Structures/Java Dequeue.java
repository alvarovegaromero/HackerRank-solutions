//https://www.hackerrank.com/challenges/java-dequeue/problem

import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.addLast(num);
            set.add(num);

            if (deque.size() == m) {
                //Set size is the number of unique elements in current window
                maxUnique = Math.max(maxUnique, set.size());

                int removed = deque.removeFirst();
                
                // If the last value is not present at the deque anymore, delete it from the set
                if (!deque.contains(removed))
                    set.remove(removed);
            }
        }

        System.out.println(maxUnique);
    }
}
