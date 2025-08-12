int main () {
    char *name = malloc (sizeof (char) * LENGTH);
    int n;
    printf ("\nenter the string\n");
    scanf ("%s", name);
    n = strlen (name);
    printf ("%d", n);
    free (name);
}


 int main () 
{
    char *name;
    int n;
    size_t size = LENGTH * sizeof(char);
    name = (char *)malloc(size);
    printf("Please enter a string: \n");
    if (fgets(name, size, stdin) != NULL) 
    {
        n = strlen (name);
        printf("The length of the string is %d\n", n);
    }
    free(name);
}


