// Last updated: 6/1/2026, 8:55:10 AM
1class Solution {
2    public String interpret(String command) {
3        return command.replace("()", "o").replace("(al)", "al");
4
5    }
6}