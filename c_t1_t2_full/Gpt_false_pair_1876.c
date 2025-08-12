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
    if (fgets(str, sizeof str, stdin) != NULL) {
        size_t c1, c2;
        printf("Original: \"%s\"\n", str);
        for (c1 = 0, c2 = 0; str[c1] != 0; c1++) {
            if (!isspace(str[c1]))
                str[c2++] = str[c1];
        }
        str[c2] = 0;
        printf("Stripped: \"%s\"\n", str);
    }
    return 0;
}
