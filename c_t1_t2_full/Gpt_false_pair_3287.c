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
    char str [] = "foo $$ foo ## foo []";
    char *s = "foo";
    char *p;
    p = strsep (&str, " ");
    while (p != NULL) {
        if (strcmp (p, s))
            printf ("%s\n", p);
        p = strsep (&str, " ");
    }
    return 0;
}
