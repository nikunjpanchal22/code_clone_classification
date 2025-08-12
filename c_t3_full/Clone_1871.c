int main (void) {
    int SIZE = 100;
    char string [SIZE];
    scanf ("%s", string);
    if (strcmp (&(string[strlen (string) - 4]), ".txt"))
        strcat (string, ".txt");
    printf ("%s\n", string);
    return 0;
}


 
int main (void) {
    int SIZE = 100;
    char string [SIZE];
    printf (" Enter a string: \n");
    scanf ("%s", string);
    int len = strlen (string);
    if (len >= 4 && !(strcmp (&(string[len - 4]), ".txt"))) {
        strcat (string, ".txt");
        printf ("%s\n", string);
    }
    else {
        printf ("Invalid Input");
    }
    return 0;
}


