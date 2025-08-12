int main (int argc, char *argv []) {
    const char *str = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
    char *strCpy;
    char **split;
    int num;
    int i;
    strCpy = malloc (strlen (str) * sizeof (*strCpy));
    strcpy (strCpy, str);
    split = str_split (strCpy, ',', &num);
    if (split == NULL) {
        puts ("str_split returned NULL");
    }
    else {
        printf ("%i Results: \n", num);
        for (i = 0; i < num; i++) {
            puts (split [i]);
        }
    }
    free (split);
    free (strCpy);
    return 0;
}


int main (int argc, char *argv []) {
    char *str = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
    char *strCpy;
    char **split;
    int num;
    int i;
    strCpy = malloc (strlen (str) * sizeof (*strCpy));
    strcpy (strCpy, str);
    split = str_split (strCpy, ',', &num);
    if (split == NULL) {
        puts ("str_split returned NULL");
    }
    else {
        printf ("%i Results: \n", num);
        for (i = 0; i < num; i++) {
            puts (split [i]);
        }
    }
    free (split);
    free (strCpy);
    return 0;
}
