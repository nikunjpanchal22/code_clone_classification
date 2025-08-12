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
    int len = strlen (str);
    int beg = 0;
    for (int i = 0; i < len - 3; i ++) {
        if (str [i] == 'f' && str [i + 1] == 'o' && str [i + 2] == 'o' && str [i + 3] == ' ') {
            if (strcmp (& str [beg], s))
                printf ("%.3s\n", & str [beg]);
            beg = i + 4;
        }
    }
    if (strcmp (& str [beg], s))
        printf ("%.3s\n", & str [beg]);
    return 0;
}


