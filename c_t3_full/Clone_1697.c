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
    char *charArray;
    int count;
    printf ("enter the no. of characters:");
    scanf ("%d", &count);
    charArray = (char *) malloc (count + 1);
    printf ("the entered no. is:%d\n", count);
    int i;
    for (i = 0; i < count; i++) {
        printf ("enter the characters:");
        getchar ();
        scanf ("%c", &charArray[i]);
    }
    printf ("the entered characters are:");
    for (i = 0; i < count; i++) {
        printf ("%c", charArray[i]);
    }
    free (charArray);
    return 0;
}


