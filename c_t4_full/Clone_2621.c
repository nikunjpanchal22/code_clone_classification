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
int main() {
    int dollar=0; char dime='0', penny='0'; int fix=0;
    FILE *valFile; valFile = fopen("values.txt", "r");
    while(fscanf(valFile, "%d.%c%c%*1[\n]", &dollar, &dime, &penny)!=EOF) {
        dime-=48; penny-=48;
        fix = (dollar * 100) + (dime * 10) + penny;
        printf("$%d.%02d -> %d (cents)\n", dollar, dime*10 + penny, fix);
    }
    return 0;
}


