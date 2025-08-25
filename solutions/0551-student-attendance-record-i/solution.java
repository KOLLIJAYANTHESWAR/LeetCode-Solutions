class Solution {
    public boolean checkRecord(String s) {
        boolean is = false;
        int noa = 0;
        int l =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == 'P'){
                is = true;
                l = 0;
            }
            else if(ch == 'A'){
                noa++;
                l = 0;
                is = true;
                if(noa >=2){
                    return false;
                }
            }
            else if(ch == 'L'){
                l++;
                is = true;
                if(l >= 3){
                    return false;
                }
            }
        }
        return is;
    }
}
