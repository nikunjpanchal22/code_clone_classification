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
    int dollarAmount=0; char dimeValue='0', pennyValue='0'; int fixedAmt=0;
    FILE *valueFile; valueFile = fopen("values.txt", "r");
    while(fscanf(valueFile, "%d.%c%c%*1[\n]", &dollarAmount, &dimeValue, &pennyValue) != EOF) {
        dimeValue -= '0'; pennyValue -= '0';
        fixedAmt = (dollarAmount * 100) + (dimeValue * 10) + pennyValue;
        printf("$%d.%02d -> %d (cents)\n", dollarAmount, dimeValue*10 + pennyValue, fixedAmt);
    }
    return 0;
}


