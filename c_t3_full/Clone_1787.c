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
    char seps[] = " ";
    char *token;

    for (token = strtok(str, seps); token != NULL; token = strtok(NULL, seps)) {
        if (strcmp (token, s))
            printf ("%s\n", token);
    }

    return 0;
}


