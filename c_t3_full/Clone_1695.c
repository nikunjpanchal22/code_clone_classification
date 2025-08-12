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
    char *chars;
    int amount;
    printf ("enter the number of characters:");
    scanf ("%d", &amount);
    chars = (char *) malloc (amount + 1);
    printf ("the entered no. is:%d\n", amount);
    int i;
    for (i = 0; i < amount; i++) {
        printf ("enter the letters:");
        getchar ();
        scanf ("%c", &chars[i]);
    }
    printf ("the entered letters are:");
    for (i = 0; i < amount; i++) {
        printf ("%c", chars[i]);
    }
    free (chars);
    return 0;
}


