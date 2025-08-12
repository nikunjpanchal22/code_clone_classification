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


int main (void) {
    char s [15];
    if (fgets (s, sizeof s, stdin) != NULL) {
        size_t a, b;
        printf ("Original: \"%s\"\n", s);
        for (a = 0, b = 0; s[a] != 0; a++) {
            if (!isspace (s[a]))
                s[b++] = s[a];
        }
        s[b] = 0;
        printf ("Stripped: \"%s\"\n", s);
    }
    return 0;
}
