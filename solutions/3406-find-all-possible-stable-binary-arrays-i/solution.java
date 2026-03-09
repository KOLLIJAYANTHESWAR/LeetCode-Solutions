class Solution {

    static final int MOD = 1000000007;

    public int numberOfStableArrays(int zero, int one, int limit){

        long[][] dp0 = new long[zero + 1][one + 1];
        long[][] dp1 = new long[zero + 1][one + 1];

        for(int z= 0; z<=zero;z++){
            for(int o= 0;o <=one;o++){
                if(z==0 && o==0){ 
                    continue;
                }

                for(int k =1;k<=limit &&k<=z;k++){
                    if (z-k ==0 && o== 0){
                        dp0[z][o]=(dp0[z][o] +1)% MOD;
                    }
                    else{
                        dp0[z][o]=(dp0[z][o] +dp1[z - k][o])% MOD;
                    }
                }
                for(int k=1; k <=limit && k<=o;k++){
                    if (z==0 && o-k == 0){
                        dp1[z][o] = (dp1[z][o] +1) % MOD;
                    }
                    else{
                        dp1[z][o] = (dp1[z][o] + dp0[z][o - k]) % MOD;
                    }
                }
            }
        }

        return (int)((dp0[zero][one] +dp1[zero][one])%MOD);
    }
}
