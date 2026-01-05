class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char arr[] = s.toCharArray();
        int i=0;
        while(i<n){
            int l=i;
            int r=Math.min(i+k-1,n-1);
            while(l<r){
                char temp = arr[l];
                arr[l++]=arr[r];
                arr[r--]=temp;
            }
            i+=2*k;
        }
        return String.valueOf(arr);
    }
}
