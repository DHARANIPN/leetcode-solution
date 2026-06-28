// Last updated: 6/28/2026, 9:21:35 PM
1class KthLargest {
2    private int k;
3    private PriorityQueue<Integer> minHeap;
4
5    public KthLargest(int k, int[] nums) {
6        this.k = k;
7        minHeap = new PriorityQueue<>(k);
8        for (int num : nums) {
9            if (minHeap.size() < k) {
10                minHeap.offer(num);
11            } else if (num > minHeap.peek()) {
12                minHeap.offer(num);
13                if (minHeap.size() > k) {
14                    minHeap.poll();
15                }
16            }
17        }
18    }
19
20    public int add(int val) {
21        if (minHeap.size() < k) {
22            minHeap.offer(val);
23        } else if (val > minHeap.peek()) {
24            minHeap.offer(val);
25            minHeap.poll();
26        }
27        return minHeap.peek();
28    }
29}