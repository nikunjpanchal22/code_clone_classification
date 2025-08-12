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
    char *x;
    int n;
    printf ("enter the no. of characters:");
    scanf ("%d", &n);
    x = (char *) malloc (n + 1);
    printf ("the entered no. is:%d\n", n);
    int i;
    for (i = 0; i < n; i++) {
        printf ("enter the character:");
        getchar ();
        scanf ("%c", &x[i]);
    }
    printf ("the entered characters are:");
    for (i = 0; i < n; i++) {
        printf ("%c", x[i]);
    } 
    free (x);
    return 0;
}


