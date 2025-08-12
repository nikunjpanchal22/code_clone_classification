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
    unsigned q=0, p=0; char r=0, s=0;
    FILE * file; file = fopen ("values.txt", "r");
    while (fscanf (file, "%u.%c%c", &q, &r, &s) != EOF) {
        r -= '0'; s -= '0';
        p = (q*100) + (r*10) + s;
        printf ("$%u.%u%u -> %u (cents)\n", q, r, s, p);
    } 
    return 0;
}


