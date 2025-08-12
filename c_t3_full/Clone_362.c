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
    int i = int_to_string7 (n, s1);
    while ( i > 0) {
        printf("%c", s1[i-1]);
        i = i -1;
    }
    printf("\n");
}


