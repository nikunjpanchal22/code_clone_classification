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
    while (beg < len) {
        if (str [beg] == 'f' && str [beg + 1] == 'o' && str [beg + 2] == 'o') {
            if (strcmp (& str [beg], s))        
                printf ("foo\n");
            beg += 3;
        }
        else {
            char res [50];
            int i, k = 0;
            for (i = beg; str [i] != ' '; i ++)
                res [k ++] = str [i];
            res [k] = '\0';
            if (strcmp (res, s))
                printf ("%s\n", res);
            beg += (i - beg) + 1;
        }
    }
    return 0;
}


