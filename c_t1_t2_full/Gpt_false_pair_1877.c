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


 int main (void)
{
    char str [15];
    if (fgets (str, sizeof str, stdin) != NULL) {
        size_t i, j;
        printf ("Original: \"%s\"\n", str);
        for (i = 0, j = 0; str[i] != 0; i++) {
            if (!isspace (str[i]))
                str[j++] = str[i];
        }
        str[j] = 0;
        printf ("Stripped: \"%s\"\n", str);
    }
    return 0;
}
