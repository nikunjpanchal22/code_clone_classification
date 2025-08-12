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
        int flag = 0;
        for (int j = 0; j < 3; j ++) {
            if (str [i + j] != s [j]) {
                flag = 1;
                break;
            }
        }
        if (flag == 0 && str [i + 3] == ' ') {
            if (strcmp (& str [beg], s))
                printf ("%.3s\n", &str [beg]);
            beg = i + 4;
        }
    }
    if (strcmp (& str [beg], s))
        printf ("%.3s\n", &str [beg]);
    return 0;
}


