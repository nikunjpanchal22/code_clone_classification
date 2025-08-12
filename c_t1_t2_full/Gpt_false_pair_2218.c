int main (void) {
    int i;
    int x [] = {1, 2, 3, 4, 5};
    int *y = malloc (10 * sizeof (*y));
    srand (time (NULL));
    for (i = 0; i < 10; ++i) {
        y[i] = rand ();
    }
    printf ("Max of x is %d\n", maxValue (x, sizeof (x) / sizeof (x [0])));
    printf ("Max of y is %d\n", maxValue (y, 10));
    return 0;
}




int main (void) {
    int i;
    int x [] = {1, 8, 4, 7, 2};
    int *y = malloc (10 * sizeof (*y));
    srand (time (NULL));
    for (i = 0; i < 10; ++i) {
        y[i] = rand () % 25 + 25;
    }
    printf ("Max of x is %d\n", maxValue (x, sizeof (x) / sizeof (x [0])));
    printf ("Max of y is %d\n", maxValue (y, 10));
    return 0;
}
