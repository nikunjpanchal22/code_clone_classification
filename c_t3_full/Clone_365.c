int main (void) {
    unsigned int n = 1234567890;
    char *s = int_to_string (n);
    puts (s);
    free (s);
    char s1 [100];
    s1[0] = '\0';
    puts (int_to_string1 (n, s1));
}


 int main (void) {
    unsigned int n = 1234567890;
    char *s = int_to_string (n);
    puts (s);
    free (s);
    char s1[100];
    s1[0] = '\0';
    int_to_string11 (n, s1);
    int l;
    for (l=0; l<strlen(s1); l++)
        putchar (s1[l]);
    putchar('\n');
}


