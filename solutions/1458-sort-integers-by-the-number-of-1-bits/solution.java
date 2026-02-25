class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int bits[] = new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            String bit = convert(arr[i]);
            for(char ch:bit.toCharArray()){
                if(ch=='1'){
                    count++;
                }
            }
            bits[i]=count;
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(bits[i]>bits[j]||bits[i]==bits[j]&&arr[i]>arr[j]){
                    int temp = bits[i];
                    bits[i]=bits[j];
                    bits[j]=temp;

                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp; 
                }
            }
        }
        return arr;

    }
    public static String convert(int n){
        if(n==0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int rev = n%2;
            sb.append(rev);
            n/=2;
        }
        return sb.toString();
    }
}
