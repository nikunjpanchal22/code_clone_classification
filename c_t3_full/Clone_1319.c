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



int main (int argc, char **argv) {
    int n = 6;
    int tab [6] = {1, 2, 8, 4, 5, 6};
    int maxdiff = INT_MIN, i;
    for (i = 1; i < n; i++) {
       maxdiff = fmax(maxdiff, abs(tab[i] - tab[i-1]));
    }
    printf ("Max difference: %d\n", maxdiff);
    return 0;
}


