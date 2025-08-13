import java.util.*;

class Solutiondeque {
    public static void pb(ArrayDeque<Integer> dq, int x) {
        // Push to back
        dq.addLast(x);
    }

    public static void ppb(ArrayDeque<Integer> dq) {
        // Pop from back
        if (!dq.isEmpty()) {
            dq.pollLast();
        }
    }

    public static int front_dq(ArrayDeque<Integer> dq) {
        // Return front element
        if (!dq.isEmpty()) {
            return dq.peekFirst();
        }
        return -1; // If empty, return -1 (or handle as per problem statement)
    }

    public static void pf(ArrayDeque<Integer> dq, int x) {
        // Push to front
        dq.addFirst(x);
    }
}
