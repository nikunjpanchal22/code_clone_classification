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
    p = strtok (str, " ");
    while (p != NULL) {
        int flag = 1;
        for (int i = 0; i < strlen (p); i ++) {
            if (p [i] != s [i]) {
                flag = 0;
                break;
            }
        }
        if (flag == 0)
            printf ("%s\n", p);
        p = strtok (NULL, " ");
    }
    return 0;
} 


