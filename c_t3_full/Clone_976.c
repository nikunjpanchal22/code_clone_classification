int main (void) {
    char *str1 = malloc (initial_malloc);
    if (str1) {
        strcpy (str1, "hello");
        mystrncat (str1, "World", 3);
        printf ("%s\n", str1);
        free (str1);
    }
    return EXIT_SUCCESS;
}


 
int main (void) {
int initial_malloc = 10;
char *str1 = (char *) malloc (sizeof(char) * initial_malloc);
if (str1) {
        strncpy (str1, "hello", initial_malloc);
        mystrncat (str1, "World", 3);
        printf ("%s\n", str1);
        free (str1);
    }
    return EXIT_SUCCESS;
}


