class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        int gap = (2*numRows-2);
        if(numRows==1 || n<=numRows){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i+=gap){
            sb.append(s.charAt(i));
        }
        for(int r=1;r<numRows-1;r++){
            int i = r;
            int gap1 = 2* (numRows-1-r);
            int gap2 = (2*r);
            boolean rows = true;
            while(i<n){
                sb.append(s.charAt(i));
                i += rows?gap1:gap2;
                rows = !rows;
            }
        }

        for(int r = numRows-1;r<n;r+=gap){
            sb.append(s.charAt(r));
        }
        return sb.toString();
    }
}
