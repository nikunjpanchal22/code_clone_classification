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





#define initial_malloc (11*sizeof(char))
void mystrncat(char *dest, const char *src, size_t n) {
    while (*dest++)
        ;
    while (n--)
        *(dest-1) = *src++;
    *(dest-1) = '\0';
}


