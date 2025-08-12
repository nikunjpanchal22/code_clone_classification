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
    int vals [6] = {1, 2, 8, 4, 5, 6};
    int diff = abs(vals[1] - vals[0]);
    int max_diff = diff, i;
    for (i = 2; i < n; i++) {
        diff = abs(vals[i] - vals[i - 1]);
        max_diff = (diff > max_diff) ? diff : max_diff;
    }
    printf ("Max difference: %d\n", max_diff);
    return 0;
}


