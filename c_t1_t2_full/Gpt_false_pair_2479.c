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
    char *name = calloc (sizeof (char), LENGTH);
    int n;
    printf ("\nenter the string\n");
    scanf ("%s", name);
    n = strnlen (name, LENGTH);
    printf ("%d", n);
    free (name);
}
