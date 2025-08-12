int main (int argc, char **argv) {
    int n = 6;
    int tab [6] = {1, 2, 8, 4, 5, 6};
    int diff = abs (tab[1] - tab[0]), maxdiff = diff, i;
    for (i = 2; i < n; i++) {
        diff = abs (tab[i] - tab[i - 1]);
        if (diff > maxdiff)
            maxdiff = diff;
    }
    printf ("Max difference: %d\n", maxdiff);
    return 0;
}




int main () {
    int n = 6;
    int numArray [6] = {1, 2, 8, 4, 5, 6};
    int initialDiff = abs(numArray[1] - numArray[0]);
    int maxDiff = initialDiff, i;
    for (i = 2; i < n; i++) {
        initialDiff = abs(numArray[i] - numArray[i - 1]);
        maxDiff = (initialDiff > maxDiff) ? initialDiff : maxDiff;
    }
    printf ("Max difference: %d\n", maxDiff);
    return 0;
}


