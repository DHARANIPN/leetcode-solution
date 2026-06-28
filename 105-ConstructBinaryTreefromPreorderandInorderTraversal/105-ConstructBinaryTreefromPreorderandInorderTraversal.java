// Last updated: 6/28/2026, 9:27:25 PM
1class Solution {
2
3    String[] map = {
4        "", "", "abc", "def", "ghi", "jkl",
5            "mno", "pqrs", "tuv", "wxyz"
6    };
7
8    List<String> res = new ArrayList<>();
9
10    public List<String> letterCombinations(String digits) {
11        if (digits.length() == 0) {
12            return res;
13        }
14
15        backtrack(digits, 0, new StringBuilder());
16
17        return res;
18    }
19
20    private void backtrack(String digits, int idx, StringBuilder sb) {
21        if (idx == digits.length()) {
22            res.add(sb.toString());
23            return;
24        }
25
26        String letters = map[digits.charAt(idx) - '0'];
27
28        for (char ch : letters.toCharArray()) {
29            sb.append(ch);
30            backtrack(digits, idx + 1, sb);
31            sb.deleteCharAt(sb.length() - 1);
32        }
33    }
34}