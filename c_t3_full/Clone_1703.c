int main () {
    char *z;
    int a;
    printf ("enter the no.");
    scanf ("%d", & a);
    z = (char *) malloc (a);
    printf ("the entered no. is:%d\n", a);
    int i;
    for (i = 0; i < a; i++) {
        printf ("enter the letters:");
        scanf ("%c", z + i);
    }
    printf ("the entered letters are:");
    for (i = 0; i < a; i++) {
        printf ("%c\n", z);
    }
    return 0;
}


  int main () {
    char *str;
    int n;
    printf ("enter the no. of letters:");
    scanf ("%d", &n);
    str = (char *) calloc (n + 1, sizeof (char));
    printf ("the entered no. of letters is:%d\n", n);
    int i;
    for (i = 0; i < n; i++) {
        printf ("enter the letter:");
        getchar();
        scanf ("%c", &str[i]);
    }
    printf ("the entered letters are:");
    for (i = 0; i < n; i++) {
        printf ("%c", str[i]);
    }
    free (str);
    return 0;
}


