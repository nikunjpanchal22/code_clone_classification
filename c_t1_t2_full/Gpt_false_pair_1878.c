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
    if (fgets (str, sizeof str, stdin) != NULL) {
        size_t foo, bar;
        printf ("Original: \"%s\"\n", str);
        for (foo = 0, bar = 0; str[foo] != 0; foo++) {
            if (!isspace (str[foo]))
                str[bar++] = str[foo];
        }
        str[bar] = 0;
        printf ("Stripped: \"%s\"\n", str);
    }
    return 0;
}
