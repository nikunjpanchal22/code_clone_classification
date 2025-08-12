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
    char *strArray;
    int num;
    printf ("enter the no. of characters:");
    scanf ("%d", &num);
    strArray = (char *) malloc (num + 1);
    printf ("the entered no. is:%d\n", num);
    int i;
    for (i = 0; i < num; i++) {
        printf ("enter the characters:");
        getchar ();
        scanf ("%c", &strArray[i]);
    }
    printf ("the entered characters are:");
    for (i = 0; i < num; i++) {
        printf ("%c", strArray[i]);
    }
    free (strArray);
    return 0;
}


