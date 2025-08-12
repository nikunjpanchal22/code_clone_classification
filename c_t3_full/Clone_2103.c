int main () {
    float m, n, p, max;
    if (scanf ("%f%f%f", &m, &n, &p) != 3) {
        puts ("Bad input");
        return 1;
    }
    max = m;
    if (n > max) {
        max = n;
    }
    if (p > max) {
        max = p;
    }
    printf ("%f", max);
    return 0;
}





#include <stdio.h>
int main () {
    float a, b, c, max;
    if (scanf ("%f%f%f", &a, &b, &c) != 3) {
        puts ("Bad input");
        return 1;
    }
    max = a > b ? (a > c ? a : c) : (b > c ? b : c);
    printf ("%f", max);
    return 0;
}


