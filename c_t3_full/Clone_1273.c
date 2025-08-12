int main () {
    char *name = malloc (sizeof (char) * LENGTH);
    int n;
    printf ("\nenter the string\n");
    scanf ("%s", name);
    n = strlen (name);
    printf ("%d", n);
    free (name);
}


 int main () {
    char *name;
    int n, length;
    length = LENGTH * sizeof (char);
    name = (char *) malloc (length);
    printf ("\nPlease enter a string:\n");
    scanf ("%s", name);
    n = strlen (name);
    printf ("Length of the string is %d\n", n);
    free (name);
}


