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
    unsigned int i, x;
    fscanf(stdin, "%u%u", &i, &x);
    int output = 0;
    for (; x > 0; x /= 10) {
        output += ((x % 10) == x);
    }
    fprintf(stdout, "%d", output);
    return 0;
}


