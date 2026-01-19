class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        /*int maxval = Integer.MIN_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < k ; i++){
            pq.add(nums[i]);
        }
        maxval = pq.peek(); 
        list.add(maxval);
        for(int i = k ; i < nums.length ; i++){
            pq.remove(nums[i-k]);
            pq.add(nums[i]);
            maxval = pq.peek();
            list.add(maxval);
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
*/
   
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> q = new ArrayDeque<>();
        int idx = 0;

        for (int i = 0; i < n; i++) {

            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }

            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.offer(i);
            
            if (i >= k - 1) {
                ans[idx++] = nums[q.peek()];
            }
        }

        return ans;
    }
}
