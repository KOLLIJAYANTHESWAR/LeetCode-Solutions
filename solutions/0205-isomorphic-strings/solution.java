class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            map1.putIfAbsent(c1,i);
            map2.putIfAbsent(c2,i);

            if(!map1.get(c1).equals(map2.get(c2))){
                return false;
            }  
        }
        return true;
    }
}
