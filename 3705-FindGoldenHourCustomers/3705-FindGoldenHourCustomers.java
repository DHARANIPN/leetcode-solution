// Last updated: 7/31/2026, 8:35:17 AM
1public class Solution {
2    public String reorganizeString(String s) {
3        HashMap<Character, Integer> freqMap = new HashMap<>();
4        for (char c : s.toCharArray()) {
5            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
6        }
7
8        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> freqMap.get(b) - freqMap.get(a));
9        maxHeap.addAll(freqMap.keySet());
10
11        StringBuilder res = new StringBuilder();
12        while (maxHeap.size() >= 2) {
13            char char1 = maxHeap.poll();
14            char char2 = maxHeap.poll();
15
16            res.append(char1);
17            res.append(char2);
18
19            freqMap.put(char1, freqMap.get(char1) - 1);
20            freqMap.put(char2, freqMap.get(char2) - 1);
21
22            if (freqMap.get(char1) > 0) maxHeap.add(char1);
23            if (freqMap.get(char2) > 0) maxHeap.add(char2);
24        }
25
26        if (!maxHeap.isEmpty()) {
27            char ch = maxHeap.poll();
28            if (freqMap.get(ch) > 1) return "";
29            res.append(ch);
30        }
31
32        return res.toString();
33    }
34}