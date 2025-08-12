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
    int dollarValue=0; char dime='0', penny='0'; int fixedVal=0;
    FILE *valuesFile; valuesFile = fopen("values.txt", "r");
    while(fscanf(valuesFile, "%d.%c%c%*1[\n]", &dollarValue, &dime, &penny) != EOF) {
        dime -= '0'; penny -= '0';
        fixedVal = (dollarValue * 100) + (dime * 10) + penny;
        printf("$%d.%02d -> %d (cents)\n", dollarValue, dime*10 + penny, fixedVal);
    }
    return 0;
}


