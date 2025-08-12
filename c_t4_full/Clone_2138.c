int main (void) {
    unsigned int i;
    scanf ("%u", & i);
    unsigned int x;
    scanf ("%u", & x);
    int output = 0;
    int t = 0;
    while (x > 0) {
        t = x % 10;
        if (t == x) {
            output++;
        }
        x /= 10;
    }
    printf ("%d", output);
}





#include <stdio.h>
int main (void) {
    unsigned int i; fscanf(stdin, "%u", &i);
    unsigned int x = i;
    int output = 0;
    do {
        if (x % 10 == x)
            output++;
        x /= 10;
    } while (x);
    fprintf(stdout, "%d", output);
    return 0;
}


