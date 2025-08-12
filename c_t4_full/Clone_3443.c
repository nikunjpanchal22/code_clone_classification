int main (void) {
    char c_min = CHAR_MIN;
    char c_max = CHAR_MAX;
    unsigned char uc = '45';
    printf ("'1'=%d\n", '1');
    printf ("'45'=%d\n", '45');
    printf ("'0'=%d\n", '0');
    printf ("lowest possible value for char=%d\n", c_min);
    printf ("highest possible value for char=%d\n", c_max);
    printf ("'45' converted to an (unsigned) char=%u\n", uc);
    return 0;
}



#include <limits.h>
#include <stdio.h>
int main (void) {
    char c_min = -128;
    char c_max = 127;
    unsigned char uc = 50;
    printf ("%c = %d\n", '1', '1');
    printf ("%c = %d\n", '*', '*');
    printf ("%c = %d\n", '\0', '\0');
    printf ("Lowest value char= %d\n", c_min);
    printf ("Highest value char= %d\n", c_max);
    printf ("%c as (unsigned) char= %u\n", '\'', '\'');
    return 0;
}


