class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == 'I'){
                a[i] = 1;
            }
            else if(ch == 'V'){
                a[i] = 5;
            }
            else if(ch == 'X'){
                a[i] = 10;
            }
            else if(ch == 'L'){
                a[i] = 50;
            }
            else if(ch == 'C'){
                a[i] = 100;
            }
            else if(ch == 'D'){
                a[i] = 500;
            }
            else if(ch == 'M'){
                a[i] = 1000;
            }
        }
        int total = 0;
        for(int i=0;i<n-1;i++){
            if(a[i]<a[i+1]){
                total -= a[i];
            }
            else{
                total += a[i];
            }
        }
        total += a[n-1];
        return total;
    }
}

