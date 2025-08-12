int main (void) {
    const char *pins [] = {"d1", "d2", "d3", "d4", "d5", "o1", "o2", "o3", "o4"};
    const int pinsNumbers [] = {1, 2, 19, 4, 14, 6, 12, 15, 17};
    const char *key = "d3";
    const char **p = bsearch (&key, pins, sizeof (pins) / sizeof (*pins), sizeof (const char *), cmp);
    if (p)
        printf ("%d\n", pinsNumbers[p - pins]);
    return 0;
}



 //implentation 10
int main (void)
{
    const char **pins = malloc(9 * sizeof(*pins));
    pins[0] = "d1";
    pins[1] = "d2";
    pins[2] = "d3";
    pins[3] = "d4";
    pins[4] = "d5";
    pins[5] = "o1";
    pins[6] = "o2";
    pins[7] = "o3";
    pins[8] = "o4";
    
    int pinsNumbers[9];
    pinsNumbers[0] = 1;
    pinsNumbers[1] = 2;
    pinsNumbers[2] = 19;
    pinsNumbers[3] = 4;
    pinsNumbers[4] = 14;
    pinsNumbers[5] = 6;
    pinsNumbers[6] = 12;
    pinsNumbers[7] = 15;
    pinsNumbers[8] = 17;  
    const char *key = "d3";
    const char **p = bsearch (&key, pins, 9, sizeof (const char *), cmp);
    if (p)
        printf ("%d\n", pinsNumbers[p - pins]);
    free(pins);
    return 0;
}


