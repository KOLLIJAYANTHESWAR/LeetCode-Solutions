int minSteps(char* s, char* t) {
    int n = strlen(s);
    int m = strlen(t);
    if(n!=m){
        return -1;
    }
    int ch[26]; 
    for(int i=0;i<n;i++){
        ch[s[i] - 'a']++;
        ch[t[i] - 'a']--;
    }
    int arrayl = sizeof(ch) / sizeof(ch[0]);
    int total = 0;
    for(int i=0;i<arrayl;i++){
        if(ch[i]>0){
            total += ch[i];
        }   
    }
    return total;
}
