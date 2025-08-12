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
    unsigned a=0; char b=0, c=0; unsigned d=0;
    FILE *e; e = fopen ("values.txt", "r");
    while (fscanf (e, "%u.%c%c%*i\n", &a, &b, &c) != EOF) {
        b -= '0'; c -= '0';
        d = (a * 100) + (b * 10) + c;
        printf ("$%u.%u%u -> %u (cents)\n", a, b, c, d);
    }
    return 0;
}


