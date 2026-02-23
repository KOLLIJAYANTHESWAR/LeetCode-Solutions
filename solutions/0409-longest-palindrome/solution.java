class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        Map<Character ,Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;boolean is=false;
        for(int i:map.values()){
            if(i%2==0){
              count+=i;
            }
            else{
                count+=(i-1);
                is=true;
            }
        }
        return is?count+1:count;
    }
}
