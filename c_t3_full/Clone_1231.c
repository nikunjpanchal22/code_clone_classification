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


 int main (int argc, char *argv [argc]) {
    int dollars = 0;
    int dimes = 0;
    int pennies = 0;
    unsigned int fixed = 0;
    FILE *values;
    values = fopen ("values", "r");
    while (fscanf (values, "%d.%d%d%*i\n", &dollars, &dimes, &pennies) != EOF) {
        fixed = (dollars * 100) + (dimes * 10) + pennies;
        printf ("$%d.%d%d -> %u (cents)\n", dollars, dimes, pennies, fixed);
    }
    return 0;
}


