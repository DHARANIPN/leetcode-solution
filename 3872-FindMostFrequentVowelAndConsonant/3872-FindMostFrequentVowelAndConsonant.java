// Last updated: 2/6/2026, 10:44:57 AM
class Solution {
    public int maxFreqSum(String s) {
      int[] freq = new int[26];
      String v = "aeiou";
      int sum = 0;
      int vowel = 0;
      int consonant = 0;
      for(int i =0 ;i<s.length();i++){
           char ch = s.charAt(i);
           freq[ch -'a']++;
      }
      for(int i = 0;i<26;i++){
         char ch = (char)(i+'a');
         int c = freq[i];
         if(v.indexOf(ch)!=-1){
            if(c > vowel){
               vowel = c;
            }
         }
         else{
            if(c>consonant){
               consonant = c;
            }
         }
      }
      sum = vowel+ consonant;
      return sum;
    }
}
    