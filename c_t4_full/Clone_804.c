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
    int k = 0;
    char res [50];
    for (int i = 0; i < len; i ++) {
        if (str [i] != ' ') 
            res [k ++] = str [i];
        else {
            res [k] = '\0';
            if (strcmp (& res [beg], s))
                printf ("%s\n", & res [beg]);
            k = 0;
            beg = i + 1;
        }
    }
    printf ("%s\n", & res [beg]);
    return 0;
}


