class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder sb= new StringBuilder();
        // String arr[] = s.trim().split("\\s+");
        char arr[] = s.toCharArray();
        int start = 0;
        int end =0;
        while(start<n){
            while(end!=n && arr[end]!= ' '){
                end++;
            }
            int p1=start;
            int p2=end-1;
            while(p1<p2){
                char temp = arr[p1];
                arr[p1++]=arr[p2];
                arr[p2--]=temp;
            }
            start = end+1;
            end = start;
        }
        return String.valueOf(arr);
        
    }
}
