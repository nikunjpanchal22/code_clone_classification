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
    int lenString = strlen (str);
    char *names [MAX_NAMES] = { 0 };
    int i = 0;
    char delimiter[] = " ";
    char *token = strtok (str, delimiter);
    while (token) {
        names [i] = malloc (strlen (token) + 1);
        strcpy (names [i], token);
        i++;
        token = strtok (NULL, delimiter);
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


