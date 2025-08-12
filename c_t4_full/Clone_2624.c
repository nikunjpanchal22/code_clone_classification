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
    unsigned doll, d, p; unsigned fixed;
    FILE *val; val = fopen ("values.txt", "r");
    while (fscanf (val, "%u.%c%c", &doll, &d, &p) != EOF){
        d -= '0'; p -= '0';
        fixed = (doll * 100) + (d * 10) + p;
        printf ("$%u.%02u -> %u (cents)\n", doll, d*10 + p, fixed);
    }
    return 0;
}


