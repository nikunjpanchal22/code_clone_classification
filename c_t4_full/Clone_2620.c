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





#include <stdio.h>
int main(void) {
    unsigned int dollars = 0; char dimes = '0', pennies = '0'; unsigned int fixed = 0;
    FILE *inputFile; inputFile = fopen("values.txt", "r");
    while(fscanf(inputFile, "%u.%c%c%*1[\n]", &dollars, &dimes, &pennies) != EOF) {
        dimes -= 48; pennies -= 48;
        fixed = (dollars * 100) + (dimes * 10) + pennies;
        printf("$%u.%02u -> %u (cents)\n", dollars, dimes*10 + pennies, fixed);
    }
    return 0;
}


