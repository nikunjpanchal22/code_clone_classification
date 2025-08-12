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
    char arr [15];
    if (fgets (arr, sizeof arr, stdin) != NULL) {
        size_t h, i;
        printf ("Original: \"%s\"\n", arr);
        for (h = 0, i = 0; arr[h] != 0; h++) {
            if (!isspace (arr[h]))
                arr[i++] = arr[h];
        }
        arr[i] = 0;
        printf ("Stripped: \"%s\"\n", arr);
    }
    return 0;
}
