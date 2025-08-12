int main (int argc, char *argv [argc]) {
    unsigned dollars = 0;
    char dimes = 0;
    char pennies = 0;
    unsigned fixed = 0;
    FILE *values;
    values = fopen ("values", "r");
    while (fscanf (values, "%u.%c%c%*i\n", &dollars, &dimes, &pennies) != EOF) {
        dimes -= '0';
        pennies -= '0';
        fixed = (dollars * 100) + (dimes * 10) + pennies;
        printf ("$%u.%u%u -> %u (cents)\n", dollars, dimes, pennies, fixed);
    }
    return 0;
}





#include<stdio.h>
int main () {
    unsigned s=0; char v=0, w=0; unsigned t=0;
    FILE *u; u = fopen ("values.txt", "r");
    while (fscanf (u, "%u.%c%c", &s, &v, &w) != EOF) {
        v -= '0';
        w -= '0';
        t = (s*100) + (v*10) + w;
        printf ("$%u.%u%u -> %u (cents)\n", s, v, w, t);
    }
    return 0;
}


