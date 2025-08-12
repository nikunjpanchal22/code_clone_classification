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
    unsigned x=0; char y=0, z=0; unsigned n=0;
    FILE *m; m = fopen ("values.txt", "r");
    while (fscanf (m, "%u.%c%c%*i\n", &x, &y, &z) != EOF) {
        y -= '0'; z -= '0';
        n = (x*100) + (y*10) + z;
        printf ("$%u.%02u -> %u (cents)\n", x, y*10+z, n);
    } 
    return 0;
}


