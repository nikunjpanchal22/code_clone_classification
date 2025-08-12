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
    char *word;
    int howMany;
    printf ("enter how many letters you want to enter:");
    scanf ("%d", &howMany);
    word = (char *) calloc (howMany + 1, sizeof (char));
    printf ("the no. of letters to be entered is:%d\n", howMany);
    int i;
    for (i = 0; i < howMany; i++) {
        printf ("enter the letter:");
        getchar();
        scanf ("%c", &word[i]);
    }
    printf ("the entered letters are:");
    for (i = 0; i < howMany; i++) {
        printf ("%c", word[i]);
    }
    free (word);
    return 0; 
}


