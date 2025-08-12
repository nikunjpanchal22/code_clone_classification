int main (void) {
    char str [15];
    if (fgets (str, sizeof str, stdin) != NULL) {
        size_t r, w;
        printf ("Original: \"%s\"\n", str);
        for (r = 0, w = 0; str[r] != 0; r++) {
            if (!isspace (str[r]))
                str[w++] = str[r];
        }
        str[w] = 0;
        printf ("Stripped: \"%s\"\n", str);
    }
    return 0;
}


 int main (void){
    char str[15]; 
    if (fgets(str, sizeof str, stdin) != NULL){
        size_t a, b; 
        printf("Original: \"%s\"\n", str); 
        a = 0; 
        b = 0;
        while(str[a] != 0 ){
            if(!isspace(str[a])){
                str[b] = str[a]; 
                b++;
            }
            a++;
        } 
        str[b] = 0;
        printf("Stripped: \"%s\"\n", str);
    } 
    return 0;
}


