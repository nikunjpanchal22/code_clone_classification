int main () {
    int i;
    int c = 0;
    char **arr = NULL;
    int count = 0;
    char str [80] = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
    c = dtmsplit (str, ",", &arr, &count);
    printf ("Found %d tokens.\n", count);
    for (i = 0; i < count; i++)
        printf ("string #%d: %s\n", i, arr[i]);
    return (0);
}


int main () {
    int j;
    int a = 0;
    char **x = NULL;
    int b = 0;
    char r[80] = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
    a = dtmsplit (r, ",", &x, &b);
    printf ("Found %d tokens.\n", b);
    for (j = 0; j < b; j++)
        printf ("string #%d: %s\n", j, x[j]);
    return (0);
}
