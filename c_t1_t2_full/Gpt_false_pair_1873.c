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
    char str [15];
    if (fgets(str, sizeof str, stdin) != NULL){
        size_t x, y; 
        printf("Original: \"%s\"\n", str);
        for(x = 0, y = 0; str[x] != 0; x++){ 
            if (!isspace(str[x]))
                str[y++] = str[x];
        }
        str[y] = 0;
        printf("Stripped: \"%s\"\n", str);
    }
    return 0;
}
