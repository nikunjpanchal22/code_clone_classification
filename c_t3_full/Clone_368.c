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
    int k = int_to_string8 (n, s1);
    for( ; k>0; k--)
        printf("%c", s1[k-1]);
    printf("\n");
}


