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
    char string [] = "test string.";
    char *list [MAX_NAMES] = {0};
    char *tests;
    int i = 0;
    tests = strtok (string, " ");
    while (tests != NULL && i < MAX_NAMES) {
        list[i] = malloc (strlen (tests) +1);
        strcpy (list [i ++], tests);
        tests = strtok (NULL, " ");
    }
    for (i = 0; i < MAX_NAMES; ++i) {
        if (list[i]) {
            printf (list [i]);
            free (list [i]);
            list[i] = 0;
        }
    }
    return 0;
}
