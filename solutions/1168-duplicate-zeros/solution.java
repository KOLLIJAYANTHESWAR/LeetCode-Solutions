class Solution {
    public void duplicateZeros(int[] a) {
        int n = a.length;
        int b[] = a.clone();
        int f=0,s=0;
        while(f<n){
            a[f]=b[s];
            if(b[s]==0){
                if(f+1<n){
                    a[++f]=0;
                }
            }
            f++;s++;
        } 
    }
}
