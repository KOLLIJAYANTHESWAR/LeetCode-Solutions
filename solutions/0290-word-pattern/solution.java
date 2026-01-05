class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n = pattern.length();
        String words[] = s.split(" ");
        int m = words.length;
        if(n!=m){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for(int i=0;i<n;i++){
            char ch = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)){
                    return false;
                }
            }
            else{
                if(set.contains(word)){
                    return false;
                }
                map.put(ch,word);
                set.add(word);
            }
        }
        return true;
    }
}
