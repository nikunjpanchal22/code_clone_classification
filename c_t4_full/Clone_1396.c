int main (void) {
    unsigned int n = 1234567890;
    char *s = int_to_string (n);
    puts (s);
    free (s);
    char s1 [100];
    s1[0] = '\0';
    puts (int_to_string1 (n, s1));
}


 

#include <stdio.h>

int main() {
    unsigned int n = 1234567890;
    char s[15];
    snprintf(s, 15, "%u", n);
    puts(s);
    char s1[15];
    snprintf(s1, 15, "%u", n);
    puts(s1);
    return 0;
}


