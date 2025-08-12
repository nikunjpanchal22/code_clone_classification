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
    int_to_string10 (n, s1);
    int j;
    for ( j= 0; j< strlen(s1); j++) 
        printf("%c", s1[j]);
    printf("\n");
}


