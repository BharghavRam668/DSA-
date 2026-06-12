import java.util.*;

class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);
        Arrays.sort(workers);

        int l = 0, r = Math.min(tasks.length, workers.length);

        while (l < r) {
            int mid = (l + r + 1) / 2;

            if (can(mid, tasks, workers, pills, strength))
                l = mid;
            else
                r = mid - 1;
        }

        return l;
    }

    private boolean can(int k, int[] tasks, int[] workers,
                        int pills, int strength) {

        Deque<Integer> dq = new ArrayDeque<>();
        int j = 0;

        for (int i = workers.length - k; i < workers.length; i++) {

            while (j < k && tasks[j] <= workers[i] + strength) {
                dq.offerLast(tasks[j++]);
            }

            if (dq.isEmpty())
                return false;

            if (dq.peekFirst() <= workers[i]) {
                dq.pollFirst();         
            } else {
                if (pills-- == 0)
                    return false;
                dq.pollLast();          
            }
        }

        return true;
    }
}