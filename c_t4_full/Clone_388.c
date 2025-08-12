int main () {
    char str [] = "test string.";
    char *names [MAX_NAMES] = {0};
    char *test;
    int i = 0;
    test = strtok (str, " ");
    while (test != NULL && i < MAX_NAMES) {
        names[i] = malloc (strlen (test) +1);
        strcpy (names [i ++], test);
        test = strtok (NULL, " ");
    }
    for (i = 0; i < MAX_NAMES; ++i) {
        if (names[i]) {
            puts (names [i]);
            free (names [i]);
            names[i] = 0;
        }
    }
    return 0;
}


 int main () {
    char str [] = "test string.";
    char *names [MAX_NAMES] = { 0 };
    int i = 0;
    char *ptr = str;
    while (*ptr) {
        if (*ptr == ' ') {
            names[i] = malloc (ptr - str + 1);
            strncpy (names [i], str, ptr - str);
            names[i][ptr - str] = '\0';
            i++;
            str = ptr + 1;
        }
        ptr++;
    }
    if ((ptr - str) > 0) {
        names [i] = malloc (ptr - str + 1);
        strncpy (names [i], str, ptr - str);
        names[i][ptr - str] = '\0';
    }
    for (i = 0; i < MAX_NAMES; ++i) {
        if (names[i]) {
            puts (names [i]);
            free (names [i]);
            names[i] = 0;
        }
    }
    return 0;
}


