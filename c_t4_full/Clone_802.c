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
    int flag = 0;
    for (int i = 0; i < strlen (str); i ++) {
        flag = 0;
        if (str [i] != ' ' && str [i] != '\0')
            printf ("%c", str [i]);
        else {
            for (int j = i + 1; j < strlen (str); j ++) {
                if (str [j] != ' ' && str [j] != '\0') {
                    if (strcmp (& str [i + 1], s))
                        break;
                    else {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0)
                printf ("\n");
        }
    }
    return 0;
}


