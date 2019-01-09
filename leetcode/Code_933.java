package test.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Code_933 {
    class RecentCounter {
        Queue<Integer> queue;
        public RecentCounter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.add(t);
            t = t-3000;
            while (queue.peek() > t){
                queue.poll();
            }
            return queue.size();
        }
    }
}
