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
    char *characters;
    int num;
    printf ("enter the no. of characters:");
    scanf ("%d", &num);
    characters = (char *) malloc (num + 1);
    printf ("the entered no. is:%d\n", num);
    int i;
    for (i = 0; i < num; i++) {
        printf ("enter the characters:");
        getchar ();
        scanf ("%c", &characters[i]);
    }
    printf ("the entered characters are:");
    for (i = 0; i < num; i++) {
        printf ("%c", characters[i]);
    }
    free (characters);
    return 0;
}


