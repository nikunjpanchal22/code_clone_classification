int main (int ac, char *argv []) {
    char str [] = "foo $$ foo ## foo []";
    char *s = "foo";
    char *p;
    p = strtok (str, " ");
    while (p != NULL) {
        if (strcmp (p, s))
            printf ("%s\n", p);
        p = strtok (NULL, " ");
    }
    return 0;
}


int main (int ac, char *argv []) {
    char string [] = "foo $$ foo ## foo []";
    char *title = "foo";
    char *pointer;
    pointer = strtok (string, " ");
    while (pointer != NULL) {
        if (strcmp (pointer, title))
            printf ("%s\n", pointer);
        pointer = strtok (NULL, " ");
    }
    return 0;
}
