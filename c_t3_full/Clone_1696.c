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
    char *letters;
    int no;
    printf ("enter the no. of characters:");
    scanf ("%d", &no);
    letters = (char *) malloc (no + 1);
    printf ("the entered no. is:%d\n", no);
    int i;
    for (i = 0; i < no; i++) {
        printf ("enter the characters:");
        getchar ();
        scanf ("%c", &letters[i]);
    }
    printf ("the entered characters are:");
    for (i = 0; i < no; i++) {
        printf ("%c", letters[i]);
    }
    free (letters);
    return 0;
}


