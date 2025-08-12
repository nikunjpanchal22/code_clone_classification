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
    float m, n, p, max;
    float* pm = &m;
    float* pn = &n;
    float* pp = &p;
    if (scanf ("%f%f%f", pm, pn, pp) != 3) {
        puts ("Bad input");
        return 1;
    }
    max = *pm;
    if (*pn > max) 
        max = *pn;
    if (*pp > max) 
        max = *pp;
    printf ("%f", max);
    return 0;
}


