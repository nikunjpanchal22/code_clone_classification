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


 int main(void){
    char str[15];
    if(fgets(str, sizeof str, stdin) != NULL) {
        int i = 0;
        int j = 0;  
        printf("Original: \"%s\"\n", str);
        while(str[i] != '\0'){
            if(!isspace(str[i])){
                str[j] = str[i];
                j++;
            }
            i++;
        } 
        str[j] = '\0'; 
        printf("Stripped: \"%s\"\n", str);
    }
    return 0;
}


