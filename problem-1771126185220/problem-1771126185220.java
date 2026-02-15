// Last updated: 2/15/2026, 8:59:45 AM
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        Set<Integer> onbulbs = new HashSet<>();
4        for(int s:bulbs){
5            if(onbulbs.contains(s)){
6                onbulbs.remove(s);
7            } else{
8                onbulbs.add(s);
9            }
10        }
11        List<Integer> result = new ArrayList<>(onbulbs);
12        Collections.sort(result);
13        return result;
14    }
15}